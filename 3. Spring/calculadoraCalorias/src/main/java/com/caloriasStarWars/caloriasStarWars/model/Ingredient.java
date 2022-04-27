package com.caloriasStarWars.caloriasStarWars.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient {
    private String name;
    private int calories;
}
