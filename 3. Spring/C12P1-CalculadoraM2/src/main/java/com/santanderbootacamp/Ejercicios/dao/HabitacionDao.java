package com.santanderbootacamp.Ejercicios.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
public class HabitacionDao implements Dao<String, Double> {
    private String nombre;
    private double ancho;
    private double largo;

    @Override
    public Double calcularM2() {
        return ancho * largo;
    }

    @Override
    public String toString() {
        return nombre + "{ancho=" + ancho + "mts, largo=" + largo + "mts}";
    }
}
