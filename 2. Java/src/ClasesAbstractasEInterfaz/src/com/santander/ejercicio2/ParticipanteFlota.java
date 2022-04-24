package com.santander.ejercicio2;

import java.util.List;

public class ParticipanteFlota extends Jugador<FlotaNave> {
    private String nombre;
    private int puntos;
    private FlotaNave equipo;

    public ParticipanteFlota(String nombre, FlotaNave flota) {
        this.nombre = nombre;
        this.equipo = flota;
        puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public FlotaNave getEquipo() {
        return equipo;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void inscribirse(List<Jugador> lista) {
        lista.add(this);
    }


    public int getPuntos() {
        return puntos;
    }
}
