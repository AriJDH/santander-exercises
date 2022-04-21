package com.santander.sistema;

public class PracticaExcepciones {
    private int a = 0;
    private int b = 300;

    //Constructor
    public PracticaExcepciones() {
        this.a = a;
        this.b = b;
    }

    //GETTERS
    public int getA() {return a;}
    public int getB() {return b;}

    public double calcular_cociente () {
        return getB() / getA();
    }
}


