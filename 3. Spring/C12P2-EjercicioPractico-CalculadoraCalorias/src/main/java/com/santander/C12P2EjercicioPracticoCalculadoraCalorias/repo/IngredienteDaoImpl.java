package com.santander.C12P2EjercicioPracticoCalculadoraCalorias.repo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.santander.C12P2EjercicioPracticoCalculadoraCalorias.dto.IngredienteDto;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository("IngredienteDaoImpl")

public class IngredienteDaoImpl implements Dao<String, IngredienteDto>{

    private List<IngredienteDto> ingredientes = new ArrayList<>();

    public IngredienteDaoImpl() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:food.json");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false); //sirve para que no sea necesario que sea igual al json

        objectMapper.registerModule(new JavaTimeModule());
        TypeReference<List<IngredienteDto>> typeRef = new TypeReference<>() {};
        List<IngredienteDto> ingredientes = null;
        try {
            ingredientes = objectMapper.readValue(file, typeRef);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        this.ingredientes = ingredientes;
    }

    @Override
    public IngredienteDto getElementos(String clave) {
        IngredienteDto ingrediente_encontrado = null;
        if(ingredientes.stream().anyMatch(persona -> Objects.equals(persona.getName(), clave))){
            ingrediente_encontrado = ingredientes.stream().filter(persona -> Objects.equals(persona.getName(), clave)).findFirst().get();
        }
        return ingrediente_encontrado;
    }


}
