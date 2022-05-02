package com.inmobiliaria.calcularMetrosCuadrados.datos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HabitacionDTO {
    private String nombre;
    private int ancho;
    private int largo;
    private double metrosCuadrados;
}
