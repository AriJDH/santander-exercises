package com.C13.practicaIntegradora.repositories;

import com.C13.practicaIntegradora.models.EntradaBlog;
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
import java.util.stream.Collectors;
@Repository
public class EntradaBlogDao implements Dao<Integer, EntradaBlog> {

    private List<EntradaBlog> posts = new ArrayList<>();

    public EntradaBlogDao(){
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:blog.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<EntradaBlog>> typeRef = new TypeReference<>() {};
        List<EntradaBlog> posts = null;

        try {
            posts = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.posts = posts;

    }


    @Override
    public List<EntradaBlog> getElementos(Integer clave) {
        //return this.personajes.stream().filter(p -> p.getName().contains(clave) ).collect(Collectors.toList());
        return this.posts.stream().filter(p -> p.getId().equals(clave)).collect(Collectors.toList());
    }

    @Override
    public List<EntradaBlog> getElementos() {
        return this.posts;
    }
}
