package com.santander.AgenciaDeTurismo.repo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.santander.AgenciaDeTurismo.models.Hotel;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Repository(value ="HotelDAOImpl")
public class HotelDAOImpl implements HotelDAO {

    private List<Hotel> hoteles = new ArrayList<>();

    public HotelDAOImpl() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:hoteles.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Hotel>> typeRef = new TypeReference<>() {};
        List<Hotel> hotelesAGuardar = null;
        try {
            hotelesAGuardar = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.hoteles = hotelesAGuardar;
    }

    @Override
    public Hotel buscarElemento(String clave) {
        return this.hoteles.stream().filter(p -> p.getHotelCode().equals(clave)).findFirst().orElse(null);
    }

    public void confirmarReserva(Hotel hotel) {
        hotel.setReserved(true);
    }

    public List<Hotel> obtenerElementos() {
        return hoteles;
    }

}
