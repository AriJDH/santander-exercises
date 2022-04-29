package com.santander.bootcamp.M4C12P2.repositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.santander.bootcamp.M4C12P2.models.Personaje;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonajeDAO {

    private List<Personaje> personajes = new ArrayList<>();

    public PersonajeDAO(){
        File file = null;

        try {
            file = ResourceUtils.getFile("classpath:starwars.json");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Personaje>> typeRef = new TypeReference<>(){};
        try {
            this.personajes = objectMapper.readValue(file, typeRef);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> buscarPersonaje(String textoABuscar) {
        return personajes.stream().filter((p) -> p.getName().toLowerCase().contains(textoABuscar.toLowerCase())).map((p) -> p.getName()).collect(Collectors.toList());
    }

}
