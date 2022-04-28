package com.santander.bootcamp.M4C12P2.DTO;

import com.santander.bootcamp.M4C12P2.models.Plato;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class PlatoDTO {
    private String nombre;
    private List<IngredientePesoDTO> ingredientes;

    public PlatoDTO(Plato plato) {
        this.setNombre(plato.getNombre());
        this.setIngredientes(plato.getIngredientes());
    }
}
