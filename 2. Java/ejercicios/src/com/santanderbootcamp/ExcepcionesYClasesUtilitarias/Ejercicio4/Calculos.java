package com.santanderbootcamp.ExcepcionesYClasesUtilitarias.Ejercicio4;

public class Calculos {
    public static double mayor(double numero1, double numero2) {
        return Math.max(numero1, numero2);
    }
    public static double menor(double numero1, double numero2) {
        return Math.min(numero1, numero2);
    }
    public static double potencia(double base, double exponente) {
        return Math.pow(base,exponente);
    }
    public static double coseno(double angulo) {
        return Math.cos(angulo);
    }
    public static double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }
    public static int numeroAleatorio() {
        return (int)(Math.random() * 1000);
    }
}
