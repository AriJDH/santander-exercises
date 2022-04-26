package com.ejercicio2.Ejercicio2.dto;

public class PropiedadDTO {
    private String nombre;
    private double metroCuadrados;

    public PropiedadDTO(String nombre, double metroCuadrados) {
        this.nombre = nombre;
        this.metroCuadrados = metroCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetroCuadrados() {
        return metroCuadrados;
    }

    public void setMetroCuadrados(double metrosCuadrados) {
        this.metroCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "PropiedadDTO{" +
                "nombre='" + nombre + '\'' +
                ", metrosCuadrados=" + metroCuadrados +
                '}';
    }
}
