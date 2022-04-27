package c12exercises.p2.dao;

import c12exercises.p2.dto.response.IngredienteDtoResponse;
import c12exercises.p2.models.Ingrediente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IngredientesDao implements Dao<String, IngredienteDtoResponse> {

    List<IngredienteDtoResponse> ingredientes = new ArrayList<>();

    public IngredientesDao() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:food.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<IngredienteDtoResponse>> typeRef = new TypeReference<>() {};
        List<IngredienteDtoResponse> ingredientes = null;
        try {
            ingredientes = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.ingredientes = ingredientes;
    }

    @Override
    public IngredienteDtoResponse getElement(String s) {
        IngredienteDtoResponse i = null;
        for (IngredienteDtoResponse ing: this.ingredientes) {
            if (ing.getName().equals(s)) {
                i = ing;
            }
        }
        return i;
    }

    @Override
    public List<IngredienteDtoResponse> getElements() {
        return this.ingredientes;
    }


    @Override
    public void addElement(IngredienteDtoResponse ingrediente) {
        this.ingredientes.add(ingrediente);
    }
}
