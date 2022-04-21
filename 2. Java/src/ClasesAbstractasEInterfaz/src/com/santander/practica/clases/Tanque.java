package com.santander.practica.clases;

public class Tanque extends Tirador{

    public Tanque(String nombreJugador) {
        super(nombreJugador);
    }

    @Override
    public boolean disparar() {
        int chanceImpacto = 5;
        int tiro = (int) Math.floor(Math.random() * 10);
        return tiro >= chanceImpacto;
    }

    @Override
    public double calcularPuntaje() {
        return 1.5;
    }
}
