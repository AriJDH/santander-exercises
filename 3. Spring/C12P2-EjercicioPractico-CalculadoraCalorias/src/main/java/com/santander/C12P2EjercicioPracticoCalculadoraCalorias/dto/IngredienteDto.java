package com.santander.C12P2EjercicioPracticoCalculadoraCalorias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class IngredienteDto {
    private String name;
    private Double calories;
}
