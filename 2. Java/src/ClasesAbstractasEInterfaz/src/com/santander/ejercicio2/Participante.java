package com.santander.ejercicio2;

import java.util.List;

public class Participante extends Jugador<Nave> {
    private String nombre;
    private int puntos;
    private Nave equipo;

    public Participante(String nombre, Nave equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void inscribirse(List<Jugador> lista) {
        lista.add(this);
    }


    public Nave getEquipo() {
        return equipo;
    }

    @Override
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }
}
