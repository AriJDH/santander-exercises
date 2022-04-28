package com.santander.C12P2EjercicioPracticoCalculadoraCalorias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class PlatoDto {
    private String nombre;
    private List<IngredienteDto> ingredientes;
}
