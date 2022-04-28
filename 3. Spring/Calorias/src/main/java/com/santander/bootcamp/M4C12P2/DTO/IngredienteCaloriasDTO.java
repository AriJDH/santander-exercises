package com.santander.bootcamp.M4C12P2.DTO;

import com.santander.bootcamp.M4C12P2.models.Ingrediente;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class IngredienteCaloriasDTO {
    private String name;
    private double calories;

    public IngredienteCaloriasDTO(Ingrediente ingrediente) {
        this.setName(ingrediente.getName());
        this.setCalories(ingrediente.getCalories());
    }
}
