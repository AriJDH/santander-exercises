package com.santander.bootcamp;

public class PracticaExcepciones {
    public static void main(String[] args) {
        System.out.println();

        int a = 0;
        int b = 300;

        try {
            int auxiliar = b / a;
        } catch (Exception e) {
            // System.out.println("Se ha producido un error");
            throw new IllegalArgumentException("No se puede dividir por cero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
