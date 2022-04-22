package com.santander.bootcamp.ejercicio2.models;

import java.util.ArrayList;
import java.util.List;

public class Nave {
    private Coordenadas ubicacion;

    public Nave(Coordenadas ubicacion) {
        this.setUbicacion(ubicacion);
    }

    public Coordenadas getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(Coordenadas ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String mostrarUbicacion() {
        return "( " + this.getUbicacion().getX() + ", " + this.getUbicacion().getY() + ")";
    }

    public static Nave crearAleatoria() {
        return new Nave(Coordenadas.crearAleatoria());
    }

    public static List<Nave> crearListaAleatoria(int size) {
        List<Nave> lista = new ArrayList<>(size);

        for (int x = 0; x < size; x++) {
            lista.add(Nave.crearAleatoria());
        }

        return lista;
    }
}
