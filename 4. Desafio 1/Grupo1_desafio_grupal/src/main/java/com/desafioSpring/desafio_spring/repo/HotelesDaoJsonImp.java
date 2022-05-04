package com.desafioSpring.desafio_spring.repo;

import com.desafioSpring.desafio_spring.excepciones.HotelesException;
import com.desafioSpring.desafio_spring.modelos.Hoteles;
import com.desafioSpring.desafio_spring.modelos.Reservas;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository("HotelesDaoJsonImp")
public class HotelesDaoJsonImp implements Dao {

    private List<Hoteles> hoteles = new ArrayList<>();
    private List<Reservas> reservas = new ArrayList<>();

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

        TypeReference<List<Hoteles>> typeRef = new TypeReference<>() {
        };
        List<Hoteles> hoteles = null;
        try {
            hoteles = objectMapper.readValue(file, typeRef);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        this.hoteles = hoteles;

    }

    //Dandole un codigo de hotel y el tipo de habitacion, devuelve el hotel que se encuentra en la lista
    //si no lo encuentra retorna un null y un exception
    public Hoteles buscarHotel(String codigoHotel, String tipoHabitacion) {
        Hoteles hotel =  hoteles.stream().filter(v ->
                    v.getCodigoHotel().equals(codigoHotel) && v.getHabitacionTipo().equals(tipoHabitacion)
            ).findFirst().orElse(null);
        if (hotel == null) throw new HotelesException("El hotel no existe");
        return hotel;
    }

    //Se trae la información desde el metodo buscarHotel y se refactoriza para que figure como ya reservado
    // y se devuelve la información completa del hotel
    public void reservarHotel(String codigoHotel, String tipoHabitacion, LocalDate desde, LocalDate hasta, String user, Double precioTotal) {
        Hoteles hotel = buscarHotel(codigoHotel,tipoHabitacion);
        hotel.setReservado("SI");
        reservas.add(new Reservas(codigoHotel,tipoHabitacion,desde,hasta,user,precioTotal));
    }

    //Metodos para traer la información
    @Override
    public List<Hoteles> getElementos() {
        return this.hoteles;
    }

}
