package com.santander.practica.clases;

public abstract class Tirador implements Puntaje {
    String nombreJugador;

    public Tirador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    @Override
    public String toString() {
        return "Tirador{" +
                "nombreJugador='" + nombreJugador + '\'' +
                '}';
    }

    public abstract boolean disparar();
}
