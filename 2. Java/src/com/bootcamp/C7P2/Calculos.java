package com.bootcamp.C7P2;

public class Calculos {

    public void max(double a, double b) {
        double max = Math.max(a,b);
        System.out.println("El maximo entre " + a + " y " + b + " es " + max);
    }

    public void min(double a, double b) {
        double min = Math.min(a,b);
        System.out.println("El minimo entre " + a + " y " + b + " es " + min);
    }

    public double potencia(double a, double potencia) {
        return Math.pow(a,potencia);
    }

    public double coseno(float angulo) {
        double rad = angulo * Math.PI / 180;
        return Math.cos(rad);
    }

    public double raiz_cuadrada(float numero) {
        return Math.sqrt(numero);
    }

    public int numero_aleatorio() {
        double x1 = 0;
        double x2 = 999;

        double f = Math.random()/Math.nextDown(1.0);
        double x = x1*(1.0 - f) + x2*f;

        return (int) Math.round(x);
    }
}
