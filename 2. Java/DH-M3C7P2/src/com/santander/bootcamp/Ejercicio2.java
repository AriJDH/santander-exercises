package com.santander.bootcamp;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println();

        // Mensaje final
        String mensajeFinal = "Este es el último mensaje";

        // Código que arroja excepción
        int[] numeros = new int[5];

        try {
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(mensajeFinal);
        }
    }
}
