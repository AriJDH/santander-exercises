package com.santander.ejercicio2;

import java.util.List;

public abstract class Jugador<E>{

    public E equipo;

    public int puntos;

    public E getEquipo() {
        return equipo;
    }

    public void setEquipo(E equipo) {
        this.equipo = equipo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public abstract void inscribirse(List<Jugador> lista);

}
