package com.santander.cuadrilaterosextra.modelo;

public class Paralelogramo extends Cuadrilatero{


    public Paralelogramo(Punto a, Punto b, Punto c, Punto d) {
        super(a, b, c, d);
    }


    public String obtenerArea(){
        return "El area del Paralelogramo es " + obtenerBase()*obtenerAltura();
    }
}
