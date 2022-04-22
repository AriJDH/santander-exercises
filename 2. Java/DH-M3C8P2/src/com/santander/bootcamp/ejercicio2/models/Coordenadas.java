package com.santander.bootcamp.ejercicio2.models;

import java.util.ArrayList;
import java.util.List;

public class Coordenadas {
    private int x;
    private int y;

    public Coordenadas(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static double calcularDistancia(Coordenadas a, Coordenadas b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public static Coordenadas crearAleatoria() {
        return new Coordenadas(
                (int) Math.floor(Math.random() / Math.nextDown(1.0) * 100),
                (int) Math.floor(Math.random() / Math.nextDown(1.0) * 100)
        );
    }

    public static List<Coordenadas> crearListaAleatoria(int size) {
        List<Coordenadas> lista = new ArrayList<>(size);

        for (int x = 0; x < size; x++) {
            lista.add(Coordenadas.crearAleatoria());
        }

        return lista;
    }
}
