package com.santander.ejerciciosAbstractasPoli2;

public class Nave implements Entidad{
    public int x;
    public int y;
    String name;
    int puntuacion;

    public Nave(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.puntuacion=0;
    }

     @Override
    public double calcularDistancia() {
        return 0;
    }

    @Override
    public double calcularDistancia(int x, int y) {
        double dist = Math.sqrt(Math.abs(Math.abs(Math.pow((this.x-x),2))-Math.abs(Math.pow((this.y-y),2))));
        return dist;
    }

}
