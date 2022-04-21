package com.Ejercicio1;

public class PracticaExcepciones {
    private int a = 0;
    private int b = 300;

    public float calcularCociente() {
        return (float)(this.b / this.a);
    }

    public PracticaExcepciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }
}
