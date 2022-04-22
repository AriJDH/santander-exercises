package com.santander.ejercicio2;

import java.util.LinkedList;
import java.util.List;

public class FlotaNave implements Composite{
    public List<Nave> equipo = new LinkedList<>();

    public void agregarNave(Nave nave) {
        equipo.add(nave);
    }

    @Override
    public double calcularDistancia(List<Integer> objetivo) {
        int promedio = 0;
        for(Nave nave : equipo) {
            promedio += Math.abs(nave.coordenadas.get(0) - objetivo.get(0)) + Math.abs(nave.coordenadas.get(1) - objetivo.get(1));
        }
        return promedio/equipo.size();
    }
}
