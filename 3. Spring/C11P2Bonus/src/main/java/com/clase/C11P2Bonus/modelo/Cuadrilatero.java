package com.clase.C11P2Bonus.modelo;

public class Cuadrilatero {
    protected final Punto A;
    protected final Punto B;
    protected final Punto C;
    protected final Punto D;

    //llamado por los hijos
    protected Cuadrilatero(Punto a, Punto b, Punto c, Punto d) {
        A = a;
        B = b;
        C = c;
        D = d;
    }

    public long calcularArea() {
        return 0;
    }
}
