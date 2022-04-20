package com.bootcamp.C7P2;

public class PracticaExcepciones {
    private int a = 0;
    private int b = 300;

    public void ejecutar(){
        try {
            int cociente = b/a;
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error");
        }
        System.out.println("Programa finalizado");
    }

    public void ejecutar_con_excepcion() {
        try {
            int cociente = b/a;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
    }
}
