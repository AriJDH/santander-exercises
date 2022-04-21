package com.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        PracticaExcepciones practica = new PracticaExcepciones(0, 300);
        System.out.println(practica.getA());
        System.out.println(practica.getB());

        try {
            System.out.println(practica.calcularCociente());
        } catch (ArithmeticException var6) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        } finally {
            System.out.println("Programa finalizado");
        }

    }
}
