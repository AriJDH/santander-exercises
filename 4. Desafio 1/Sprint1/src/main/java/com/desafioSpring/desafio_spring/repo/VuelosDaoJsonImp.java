package com.desafioSpring.desafio_spring.repo;

import com.desafioSpring.desafio_spring.modelos.Vuelos;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository("VuelosDaoJsonImp")
public class VuelosDaoJsonImp implements Dao {


    private List<Vuelos> vuelo = new ArrayList<>();

    //Se trae la info desde el vuelos.json
    public VuelosDaoJsonImp() {

        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:vuelos.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Vuelos>> typeRef = new TypeReference<>() {
        };
        List<Vuelos> vuelos = null;
        try {
            vuelos = objectMapper.readValue(file, typeRef);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        this.vuelo = vuelos;

    }

    //Metodos para traer la información
    @Override
    public List<Vuelos> getElementos() {
        return this.vuelo;
    }

}
