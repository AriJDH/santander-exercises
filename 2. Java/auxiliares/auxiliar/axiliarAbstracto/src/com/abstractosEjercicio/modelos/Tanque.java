package com.abstractosEjercicio.modelos;

public class Tanque extends Jugador {

    double probabilidad = 0.8;

    public Tanque() {
    }

    public Tanque(String nombre, int puntaje, double probabilidad) {
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
