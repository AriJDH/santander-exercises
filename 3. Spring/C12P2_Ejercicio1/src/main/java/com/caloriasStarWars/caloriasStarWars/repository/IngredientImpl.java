package com.caloriasStarWars.caloriasStarWars.repository;

import com.caloriasStarWars.caloriasStarWars.model.Ingredient;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Repository
public class IngredientImpl implements DAO<String, Ingredient> {
    private List<Ingredient> ingredientes;

    public IngredientImpl(){
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:food.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Ingredient>> typeRef = new TypeReference<>() {};
        List<Ingredient> ingredientes = null;
        try {
            ingredientes = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.ingredientes = ingredientes;
    }


    @Override
    public Ingredient getElemento(String nombre) {
         return ingredientes.stream().filter(p->p.getName().equalsIgnoreCase(nombre)).findFirst().orElse(null);
    }




}
