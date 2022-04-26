package com.santander.bootcamp.M4C12P1.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Habitacion {
    private String nombre;
    private double ancho;
    private double largo;

    public double calcularMetrosCuadrados() {
        return this.getAncho() * this.getLargo();
    }
}
