package com.practica.C12P2Practica.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.practica.C12P2Practica.model.Ingrediente;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository("IngredienteDaoImplJson")
public class IngredienteDaoImplJson implements Dao<String, Ingrediente> {
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public IngredienteDaoImplJson() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:food.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Ingrediente>> typeRef = new TypeReference<>() {};
        List<Ingrediente> ingredientes = null;
        try {
            ingredientes = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.ingredientes = ingredientes;
    }

    @Override
    public List<Ingrediente> getElementos() {
        return ingredientes;
    }

    @Override
    public Ingrediente getElementoPorId(String clave) {
        Ingrediente ingrediente_encontrado = null;
        if(ingredientes.stream().anyMatch(persona -> Objects.equals(persona.getName(), clave))){
            ingrediente_encontrado = ingredientes.stream().filter(persona -> Objects.equals(persona.getName(), clave)).findFirst().get();
        }
        return ingrediente_encontrado;
    }
}
