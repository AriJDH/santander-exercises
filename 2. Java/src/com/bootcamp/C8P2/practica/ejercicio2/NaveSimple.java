package com.bootcamp.C8P2.practica.ejercicio2;

public class NaveSimple implements INave {
    private final String nombre;
    private int x;
    private int y;

    public NaveSimple(String nombre, int x, int y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }

    @Override
    public double calcular_distancia(int x, int y) {
        double distancia_euclidiana = Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y,2));
        System.out.println("Nave simple: " + distancia_euclidiana);
        return distancia_euclidiana;
    }

}
