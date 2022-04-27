package com.bootcamp.calculadoraMetrosCuadrados.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Habitacion {
    String nombre;
    double ancho, largo;
}
