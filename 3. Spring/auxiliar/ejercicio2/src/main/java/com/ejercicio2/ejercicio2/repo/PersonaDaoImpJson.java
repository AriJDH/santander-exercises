package com.ejercicio2.ejercicio2.repo;

import com.ejercicio2.ejercicio2.dao.Dao;
import com.ejercicio2.ejercicio2.modelos.Persona;
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

@Repository(value = "PersonaDaoImpJson")
public class PersonaDaoImpJson implements Dao<String, Persona> {

    public PersonaDaoImpJson() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:personas.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Persona>> typeRef = new TypeReference<>() {};
        List<Persona> personas = null;
        try {
            personas = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.personas = personas;
    }

    private List<Persona> personas = new ArrayList<>();


    @Override
    public List<Persona> getElementos() {
        return this.personas;
    }

    @Override
    public void agregar(Persona elemento) {

    }
}
