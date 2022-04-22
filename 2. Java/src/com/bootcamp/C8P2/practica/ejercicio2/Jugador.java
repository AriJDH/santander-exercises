package com.bootcamp.C8P2.practica.ejercicio2;

public class Jugador {
    private final String color;
    private final INave unidad;

    public Jugador(String color, INave unidad) {
        this.color = color;
        this.unidad = unidad;
    }

    public double calcular_distancia(int x, int y) {
        return unidad.calcular_distancia(x,y);
    }

    @Override
    public String toString() {
        return color;
    }
}
