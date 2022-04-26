package com.santander.cuadrilaterosextra.modelo;

public class Cuadrilatero {

    Punto a;
    Punto b;
    Punto c;
    Punto d;

    public Cuadrilatero(Punto a, Punto b, Punto c, Punto d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double obtenerAltura(){
        return c.getY() - a.getY();
    }

    public double obtenerBase(){
        return b.getX() - a.getX();
    }



}
