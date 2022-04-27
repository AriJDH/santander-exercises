package com.ejercicio2.Ejercicio2.repository;

import com.ejercicio2.Ejercicio2.dto.PersonajeDTO;
import com.ejercicio2.Ejercicio2.models.Personaje;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository (value = "StarWarDao")
public class StarWarDao implements Dao{

    private List<Personaje> personaje=new ArrayList<>();
    public StarWarDao() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:starwars.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Personaje>> typeRef = new TypeReference<>() {};
        List<Personaje> personaje = null;
        try {
            personaje = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.personaje=personaje;
    }

    public List<Personaje> buscarPersonaje(String nombre) {
        List<Personaje> personajeMatcheados = new ArrayList<>();
        for (Personaje per : personaje) {
            if(per.getName().startsWith(nombre)){
                personajeMatcheados.add(per);
            }
        }
        return personajeMatcheados;
    }
}
