package com.santander.ejercicio2;

import java.util.List;

public class Participante extends Jugador {
    private String nombre;
    public Nave equipo;
    private int puntos;

    public Participante(String nombre, Nave nave) {
        this.nombre = nombre;
        this.equipo = nave;
        puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(Nave nave) {
        this.equipo = nave;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", nave=" + equipo +
                '}';
    }

    @Override
    public void inscribirse(List<Jugador> lista) {
        lista.add(this);
    }

    public Nave getEquipo() {
        return equipo;
    }

    public int getPuntos() {
        return puntos;
    }
}
