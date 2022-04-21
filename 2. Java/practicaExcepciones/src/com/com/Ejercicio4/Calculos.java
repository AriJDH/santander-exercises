package com.com.Ejercicio4;

public class Calculos {
    public static int elMayor(int a, int b) {
        return Math.max(a, b);
    }

    public static int elMenor(int a, int b) {
        return Math.min(a, b);
    }

    public static double laPotencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static double cosenoDelAngulo(double a) {
        return Math.cos(a);
    }

    public static double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    public static int aleatorio() {
        return (int)(Math.random() * 1000.0D);
    }
}
