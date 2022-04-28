package com.caloriasStarWars.caloriasStarWars.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class IngredientDTO {
    private String nombre;
    private int peso;
    private int calorias;
}
