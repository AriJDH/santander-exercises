package com.santander.cuadrilaterosextra.modelo;

public class Cuadrado extends Rectangulo{


    public Cuadrado(Punto a, Punto b, Punto c, Punto d) {
        super(a, b, c, d);
    }

    @Override
    public String obtenerArea() {
        return "El area del cuadrado es " + obtenerBase()*obtenerAltura();
    }
}
