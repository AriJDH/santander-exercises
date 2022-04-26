package com.santander.bootcamp.M4C12P1.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Alumno {
    private String nombre;
    private List<Asignatura> asignaturas;

    public double calcularPromedio() {
        return this.getAsignaturas().stream().reduce(
            0.0, (acumulador, asignatura) -> acumulador + asignatura.getNota(), Double::sum
        ) / this.getAsignaturas().size();
    }
}
