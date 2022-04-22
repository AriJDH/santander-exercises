package com.santander.ejercicio2;

import java.util.List;

public class ParticipanteFlota extends Jugador {
    private String nombre;
    public FlotaNave flota;
    private int puntos;

    public ParticipanteFlota(String nombre, FlotaNave flota) {
        this.nombre = nombre;
        this.flota = flota;
        puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FlotaNave getEquipo() {
        return flota;
    }

    public void setEquipo(FlotaNave flota) {
        this.flota = flota;
    }

    @Override
    public String toString() {
        return "ParticipanteFlota{" +
                "nombre='" + nombre + '\'' +
                ", flota=" + flota +
                '}';
    }

    @Override
    public void inscribirse(List<Jugador> lista) {
        lista.add(this);
    }

    public int getPuntos() {
        return puntos;
    }
}
