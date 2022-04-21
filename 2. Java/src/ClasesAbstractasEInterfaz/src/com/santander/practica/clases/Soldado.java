package com.santander.practica.clases;

public class Soldado extends Tirador{

    public Soldado(String nombreJugador) {
        super(nombreJugador);
    }

    @Override
    public boolean disparar() {
        int chanceImpacto = 7;
        int tiro = (int) Math.floor(Math.random() * 10);
        return tiro >= chanceImpacto;
    }

    @Override
    public double calcularPuntaje() {
        return 2;
    }
}
