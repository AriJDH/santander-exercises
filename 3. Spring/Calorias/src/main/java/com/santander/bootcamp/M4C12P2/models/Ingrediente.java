package com.santander.bootcamp.M4C12P2.models;

import com.santander.bootcamp.M4C12P2.DTO.IngredienteCaloriasDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ingrediente {
    private String name;
    private double calories;

    public Ingrediente(IngredienteCaloriasDTO ingredienteCaloriasDTO) {
        this.setName(ingredienteCaloriasDTO.getName());
        this.setCalories(ingredienteCaloriasDTO.getCalories());
    }

}
