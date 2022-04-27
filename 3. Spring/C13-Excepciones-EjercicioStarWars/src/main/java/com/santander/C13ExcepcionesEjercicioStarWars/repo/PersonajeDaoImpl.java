package com.santander.C13ExcepcionesEjercicioStarWars.repo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.santander.C13ExcepcionesEjercicioStarWars.modelos.Personaje;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonajeDaoImpl implements Dao<String, Personaje>{

    private List<Personaje> personajes = new ArrayList<>();

    public PersonajeDaoImpl() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:starwars.json");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false); //sirve para que no sea necesario que sea igual al json

        objectMapper.registerModule(new JavaTimeModule());
        TypeReference<List<Personaje>> typeRef = new TypeReference<>() {};
        List<Personaje> personajes = null;
        try {
            personajes = objectMapper.readValue(file, typeRef);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        this.personajes = personajes;
    }


    @Override
    public List<Personaje> getElementos(String clave) {
        return this.personajes.stream().filter(p->p.getName().contains(clave)).collect(Collectors.toList());
    }
}
