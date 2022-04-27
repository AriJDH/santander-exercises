package com.ejercicio1.Ejercicio1.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PlatoConCaloriasDTO {
    private String nombre;
    private List<IngredienteConCaloriasDTO> ingredientes;

}
