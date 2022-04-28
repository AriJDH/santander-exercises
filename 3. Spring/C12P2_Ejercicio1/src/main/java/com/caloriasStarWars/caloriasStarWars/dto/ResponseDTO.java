package com.caloriasStarWars.caloriasStarWars.dto;

import com.caloriasStarWars.caloriasStarWars.model.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
public class ResponseDTO{
    private IngredientDTO most;
    private int totalCalorias;
    private List<Ingredient> ingredientesDto;
}
