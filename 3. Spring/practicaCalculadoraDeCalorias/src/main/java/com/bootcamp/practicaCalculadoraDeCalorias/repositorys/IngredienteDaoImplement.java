package com.bootcamp.practicaCalculadoraDeCalorias.repositorys;

import com.bootcamp.practicaCalculadoraDeCalorias.models.Ingrediente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IngredienteDaoImplement implements DAO<String, Ingrediente> {

    List<Ingrediente> ingredientes = new ArrayList<>();

    public IngredienteDaoImplement(){
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
    public List<Ingrediente> getElements() {
        return this.ingredientes;
    }

    @Override
    public Ingrediente getElementBy(String nombreIngrediente) {

        Ingrediente ingrediente = new Ingrediente();
        for (Ingrediente i: ingredientes) {
            if(i.getName().equals(nombreIngrediente)){
                ingrediente = i;
                break;
            }
        }
        return ingrediente;
    }

    @Override
    public void addElement(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }
}
