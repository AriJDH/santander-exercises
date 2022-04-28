package com.bootcamp.practicaCalculadoraDeCalorias.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class IngredienteDTO {
    String name;
    int calories;
    double peso;

    public IngredienteDTO(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }
}
