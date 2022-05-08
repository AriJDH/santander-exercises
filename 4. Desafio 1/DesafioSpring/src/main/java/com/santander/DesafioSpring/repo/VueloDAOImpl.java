package com.santander.DesafioSpring.repo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.santander.DesafioSpring.models.Vuelo;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository(value = "VueloDAOImpl")
public class VueloDAOImpl implements VueloDAO {

    private List<Vuelo> vuelos = new ArrayList<>();

    public VueloDAOImpl() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:vuelos.json");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.registerModule(new JavaTimeModule());
        TypeReference<List<Vuelo>> typeRef = new TypeReference<>() {};
        List<Vuelo> vueloList = null;
        try {
            vueloList = objectMapper.readValue(file, typeRef);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        this.vuelos = vueloList;
    }

    @Override
    public List<Vuelo> obtenerElementos() {
        return vuelos;
    }

    @Override
    public Vuelo buscarElemento(String clave) {
        return this.vuelos.stream().filter(p -> p.getFlightNumber().equals(clave)).findFirst().orElse(null);
    }

}
