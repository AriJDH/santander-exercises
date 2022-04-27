package com.practica.C12P2Starwars.repo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.practica.C12P2Starwars.models.Personaje;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonajeDaoImplJson implements Dao<String, Personaje> {
    private List<Personaje> personajes = new ArrayList<>();

    public PersonajeDaoImplJson() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:food.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Personaje>> typeRef = new TypeReference<>() {};
        List<Personaje> ingredientes = null;
        try {
            ingredientes = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.personajes = ingredientes;
    }

    @Override
    public Personaje getElementoPorId(String clave) {
        Personaje ingrediente_encontrado = null;
        if(personajes.stream().anyMatch(persona -> Objects.equals(persona.getName(), clave))){
            ingrediente_encontrado = personajes.stream().filter(persona -> Objects.equals(persona.getName(), clave)).findFirst().get();
        }
        return ingrediente_encontrado;
    }
}
