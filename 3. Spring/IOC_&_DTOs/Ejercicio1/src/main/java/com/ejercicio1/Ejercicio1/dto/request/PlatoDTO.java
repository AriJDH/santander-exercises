package com.ejercicio1.Ejercicio1.dto.request;

import com.ejercicio1.Ejercicio1.model.Ingrediente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class PlatoDTO {
    private String nombre;
    private List<IngredienteDTO> ingredientes;
}
