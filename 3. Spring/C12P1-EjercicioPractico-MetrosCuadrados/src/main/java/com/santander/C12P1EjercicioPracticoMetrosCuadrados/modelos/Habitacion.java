package com.santander.C12P1EjercicioPracticoMetrosCuadrados.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Habitacion {
    private String nombre;
    private Double ancho;
    private Double largo;
}
