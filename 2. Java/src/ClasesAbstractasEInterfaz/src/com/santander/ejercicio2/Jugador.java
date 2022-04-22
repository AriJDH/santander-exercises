package com.santander.ejercicio2;

import java.util.List;

public abstract class Jugador {

    public int puntos;

    public Composite equipo;

    public int getPuntos() {
        return puntos;
    }

    public abstract void inscribirse(List<Jugador> lista);

}
