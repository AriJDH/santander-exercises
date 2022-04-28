package com.practica.practica.repo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.practica.practica.modelo.Persona;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository(value = "PersonaDaoImplJson")
public class PersonaDaoImplJson implements Dao<String, Persona>{

    private List<Persona> personas = new ArrayList<>();

    public PersonaDaoImplJson() {
        personas.add(new Persona("Carlos","Perez", LocalDate.of(2000,3,1)));
        personas.add(new Persona("Maria","Juarez",LocalDate.of(2000,6,1)));
        personas.add(new Persona("Ramona","Gomez",LocalDate.of(2000,3,10)));
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

    @Override
    public List<Persona> getElementos() {
        return this.personas;
    }

    @Override
    public void agregar(Persona elemento) {
        personas.add(elemento);
    }}
