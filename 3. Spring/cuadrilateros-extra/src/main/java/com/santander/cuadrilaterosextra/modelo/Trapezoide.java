package com.santander.cuadrilaterosextra.modelo;

public class Trapezoide extends Cuadrilatero{

    public Trapezoide(Punto a, Punto b, Punto c, Punto d) {
        super(a, b, c, d);
    }

    public double obtenerBase2(){
        return d.getX() - c.getX();
    }

    public String obtenerArea(){
        return "El area del Trapezoide es: " + (obtenerBase()+obtenerBase2()) / 2 * obtenerAltura();
    }




}
