package com.santander.bootcamp.M4C12P2.models;

import com.santander.bootcamp.M4C12P2.DTO.PlatoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Plato {
    private String nombre;
    //private HashMap<String, Double> ingredientes;
    private List<IngredientePeso> ingredientes;

    public Plato(PlatoDTO platoDTO) {
        this.setNombre(platoDTO.getNombre());
        this.setIngredientes(platoDTO.getIngredientes());
    }
}
