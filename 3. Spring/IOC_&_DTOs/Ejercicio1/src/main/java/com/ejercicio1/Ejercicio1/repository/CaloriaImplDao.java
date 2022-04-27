package com.ejercicio1.Ejercicio1.repository;

import com.ejercicio1.Ejercicio1.dto.request.IngredienteDTO;
import com.ejercicio1.Ejercicio1.model.Caloria;
import com.ejercicio1.Ejercicio1.model.Ingrediente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository(value = "CaloriaImplDao")
public class CaloriaImplDao implements Dao {
    List<Caloria> caloriasList = new ArrayList<>();

    public CaloriaImplDao() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:food.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        TypeReference<List<Caloria>> typeRef = new TypeReference<>() {
        };
        List<Caloria> calorias = null;
        try {
            calorias = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.caloriasList = calorias;
    }


    @Override
    public double caloriasTotales(List<IngredienteDTO> listaIngrediente) {

        double total = 0;
        for (IngredienteDTO ingrediente : listaIngrediente) {
            for (Caloria caloria : caloriasList) {
                if (ingrediente.getName().equalsIgnoreCase(caloria.getName())) {
                    total += caloria.getCalories() * (ingrediente.getPeso() / 10);
                }
            }
        }
        return total;
    }

    @Override
    public double obtenerCalorias(IngredienteDTO ingrediente) {
        for (Caloria caloria : caloriasList) {
            if (ingrediente.getName().equalsIgnoreCase(caloria.getName())) {
                return caloria.getCalories()*(ingrediente.getPeso()/10);
            }
        }

        return 0.00;
    }
}
