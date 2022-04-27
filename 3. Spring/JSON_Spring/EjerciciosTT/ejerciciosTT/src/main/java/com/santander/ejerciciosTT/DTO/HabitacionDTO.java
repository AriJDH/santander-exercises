package com.santander.ejerciciosTT.models;

public class HabitacionDTO {
    private String nombre;
    private double metrosCuadrados;

    public HabitacionDTO(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "HabitacionDTO{" +
                "nombre='" + nombre + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }
}
}
