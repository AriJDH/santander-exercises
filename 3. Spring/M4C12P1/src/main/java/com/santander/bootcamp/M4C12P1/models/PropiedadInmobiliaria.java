package com.santander.bootcamp.M4C12P1.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class PropiedadInmobiliaria {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones;

    public double calcularMetrosCuadrados() {
        return this.getHabitaciones().stream().reduce(
            0.0, (acumulador, habitacion) -> acumulador + habitacion.calcularMetrosCuadrados(), Double::sum
        );
    }
}
