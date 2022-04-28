package com.santander.bootcamp.M4C12P2.repositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.santander.bootcamp.M4C12P2.DTO.IngredienteCaloriasDTO;
import com.santander.bootcamp.M4C12P2.models.Ingrediente;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class IngredienteDAOImplementsJSON implements DAO<IngredienteCaloriasDTO>{
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public IngredienteDAOImplementsJSON(){
        File file = null;

        try {
            file = ResourceUtils.getFile("classpath:food.json");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Ingrediente>> typeRef = new TypeReference<>(){};
        try {
            this.ingredientes = objectMapper.readValue(file, typeRef);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void agregar(IngredienteCaloriasDTO ingredienteCaloriasDTO) {
        this.ingredientes.add(new Ingrediente(ingredienteCaloriasDTO));
    }

    @Override
    public IngredienteCaloriasDTO obtener(String nombre) {
        return new IngredienteCaloriasDTO(this.ingredientes.stream().filter(p -> p.getName().equals(nombre)).findFirst().orElse(null));
    }
}
