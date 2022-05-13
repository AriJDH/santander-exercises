package com.abstractosEjercicio.modelos;

public class Soldado extends Jugador {

    double probabilidad = 0.5;

    public Soldado() {
    }

    public Soldado(String nombre, int puntaje, double probabilidad) {
        super(nombre, puntaje);
        this.probabilidad = probabilidad;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    @Override
    public Integer disparo(int numeroTiros) {
        return null;
    }
}
