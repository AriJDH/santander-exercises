package com.bootcamp.practicaStarWars.repositorys;

import com.bootcamp.practicaStarWars.models.Personaje;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonajeDaoImplements implements DAO<String, Personaje>{

    List<Personaje> personajes = new ArrayList<>();

    public PersonajeDaoImplements(){
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:starwars.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        TypeReference<List<Personaje>> typeRef = new TypeReference<>() {};

        List<Personaje> personajes = null;
        try {
            personajes = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.personajes = personajes;
    }

    @Override
    public List<Personaje> getElements() {
        return this.personajes;
    }

    @Override
    public List<Personaje> getElementsPorPalabra(String s) {
        List<Personaje> personajesFiltrados = new ArrayList<>();
        personajesFiltrados = personajes.stream().filter(personaje -> personaje.getName().contains(s)).collect(Collectors.toList());
        return personajesFiltrados;
    }
}
