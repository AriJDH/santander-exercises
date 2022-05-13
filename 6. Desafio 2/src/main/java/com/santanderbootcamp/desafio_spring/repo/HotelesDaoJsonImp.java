package com.santanderbootcamp.desafio_spring.repo;

import com.santanderbootcamp.desafio_spring.excepciones.HotelesException;
import com.santanderbootcamp.desafio_spring.modelos.Hoteles;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository("HotelesDaoJsonImp")
public class HotelesDaoJsonImp implements Dao<String, Hoteles> {

    private List<Hoteles> hoteles = new ArrayList<>();

    //Se trae la información desde hoteles.json
    public HotelesDaoJsonImp() {

        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:hoteles.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Hoteles>> typeRef = new TypeReference<>() {};
        List<Hoteles> hotelesJson = null;
        try {
            hotelesJson = objectMapper.readValue(file, typeRef);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        this.hoteles = hotelesJson;

    }


    //Dandole un codigo de hotel y el tipo de habitacion, devuelve el hotel que se encuentra en la lista
    //si no lo encuentra retorna un null y un exception
    @Override
    public Hoteles buscar(String codigoHotel, String tipoHabitacion) {
        Hoteles hotel =  hoteles.stream().filter(v ->
                    v.getCodigoHotel().equals(codigoHotel) && v.getHabitacionTipo().equals(tipoHabitacion)
            ).findFirst().orElse(null);
        if (hotel == null) throw new HotelesException("El hotel no existe");
        return hotel;
    }

    //Se trae la información desde el metodo buscarHotel y se refactoriza para que figure como ya reservado
    // y se devuelve la información completa del hotel
    @Override
    public void reservar(String codigoHotel, String tipoHabitacion) {
        Hoteles hotel = buscar(codigoHotel,tipoHabitacion);
        if (hotel.getReservado().equals("SI")) throw new HotelesException("EL hotel ya está reservado");
        hotel.setReservado("SI");
    }

    //Metodos para traer la información
    @Override
    public List<Hoteles> getElementos() {
        if (this.hoteles.isEmpty()) throw new HotelesException("No existen hoteles");
        return this.hoteles;
    }

    @Override
    public void vaciarElementos(){
        this.hoteles = new ArrayList<>();
    }

}
