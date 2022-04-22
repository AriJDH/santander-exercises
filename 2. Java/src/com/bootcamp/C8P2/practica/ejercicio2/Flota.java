package com.bootcamp.C8P2.practica.ejercicio2;

import java.util.List;

public class Flota implements INave {
    List<NaveSimple> naves;

    public Flota(List<NaveSimple> naves) {
        this.naves = naves;
    }

    public double calcular_distancia(int x, int y) {
        double sum = 0;
        for (NaveSimple nave:
             naves) {
            sum += nave.calcular_distancia(x,y);
        }
        return sum / naves.size();
    }
}
