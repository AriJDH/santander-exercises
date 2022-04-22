package com.santander.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Nave implements Composite {
    String nombre;
    List<Integer> coordenadas = new ArrayList<>(2);
    int puntos;

    public Nave(String nombre, List<Integer> coordenadas) {
        this.nombre = nombre;
        this.coordenadas = coordenadas;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(List<Integer> coordenadas) {
        this.coordenadas = coordenadas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "nombre='" + nombre + '\'' +
                ", coordenadas=" + coordenadas +
                ", puntos=" + puntos +
                '}';
    }

    @Override
    public double calcularDistancia(List<Integer> objetivo) {
        return Math.abs(coordenadas.get(0) - objetivo.get(0)) + Math.abs(coordenadas.get(1) - objetivo.get(1));
    }
}
