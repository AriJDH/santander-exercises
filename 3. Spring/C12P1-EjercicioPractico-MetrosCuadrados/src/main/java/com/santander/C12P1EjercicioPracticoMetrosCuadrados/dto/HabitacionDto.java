package com.santander.C12P1EjercicioPracticoMetrosCuadrados.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class HabitacionDto {
    private String nombre;
    private Double ancho;
    private Double largo;
}
