package com.spring.demo.controllers.geometria;

public class Triangulo extends Cuadrilatero {

    private int base;
    private  int altura;

    public Triangulo(String name, int base, int altura) {
        super(name, base, altura);
    }


    @Override
    public double area(int base, int altura) {
        double a= (this.base*this.altura);
        return a;
    }
}
