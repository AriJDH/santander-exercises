package com.santanderbootcamp.desafio_spring.repo;

import com.santanderbootcamp.desafio_spring.excepciones.VuelosException;
import com.santanderbootcamp.desafio_spring.modelos.Vuelos;
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

@Repository("VuelosDaoJsonImp")
public class VuelosDaoJsonImp implements Dao<String, Vuelos> {


    private List<Vuelos> vuelos = new ArrayList<>();

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
        List<Vuelos> vuelosJson = null;
        try {
            vuelosJson = objectMapper.readValue(file, typeRef);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        this.vuelos = vuelosJson;
    }

    //Metodos para traer la información
    @Override
    public List<Vuelos> getElementos() {
        if (this.vuelos.isEmpty()) throw new VuelosException("No existen vuelos");
        return this.vuelos;
    }

    @Override
    public void vaciarElementos() {
        this.vuelos = new ArrayList<>();
    }

    @Override
    public void reservar(String dato1, String dato2) {
        // Como no hay cupos en los vuelos no hace falta reservar
    }

    @Override
    public Vuelos buscar(String dato1, String dato2) {
        return null;
    }

}
