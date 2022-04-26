package com.santander.cuadrilaterosextra.modelo;

public class Rectangulo extends Paralelogramo{
    public Rectangulo(Punto a, Punto b, Punto c, Punto d) {
        super(a, b, c, d);
    }

    @Override
    public String obtenerArea(){
        return  "El area del rectangulo es: " + obtenerBase()*obtenerAltura();
    }
}
