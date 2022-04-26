package com.spring.demo.controllers.geometria;

public abstract class Cuadrilatero {
    String name;
    private int base;
    private int altura;

    //constructor
    public Cuadrilatero(String name, int base, int altura){}

    //calcular el area
    abstract public double area(int base, int altura);





}
