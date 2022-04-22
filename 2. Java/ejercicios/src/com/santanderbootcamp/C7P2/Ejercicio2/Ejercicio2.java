package com.santanderbootcamp.C7P2.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        String mensajeFinal = "Este es el último mensaje";
        int[] numeros = new int[5];
        try {
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println(mensajeFinal);
        }
    }
}
