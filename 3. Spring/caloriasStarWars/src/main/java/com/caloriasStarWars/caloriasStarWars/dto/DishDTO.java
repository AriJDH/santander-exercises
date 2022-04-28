package com.caloriasStarWars.caloriasStarWars.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DishDTO {
    private String name;
    private List<IngredientDTO> ingredientes;
}
