package com.santanderbootacamp.Ejercicios.repo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.santanderbootacamp.Ejercicios.models.Ingrediente;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository(value = "IngredientesDaoImpl")
public class IngredientesDaoImpl implements Dao<String,Ingrediente>{
    List<Ingrediente> ingredientes = new ArrayList<>();

    public IngredientesDaoImpl() {

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
            //personas = objectMapper.readValue(src, HashMap.class)
            ingredientes = objectMapper.readValue(file, typeRef);

        } catch (IOException e) {
            e.printStackTrace();
        }
        this.ingredientes = ingredientes;
    }

    @Override
    public Ingrediente getElemento(String elemento) {
        return ingredientes.stream().filter(i->i.getName().equals(elemento)).findFirst().orElse(null);
    }
}
