package com.santander.C12P2EjercicioPracticoCalculadoraCalorias.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Ingrediente {
    private String name;
    private Double calories;
}
