package com.resolucion.ejercicio_1.clases;

public class PracticaExcepciones {

    int a=300;
    int b=0;

    public void calcularCociente(){
        try {
            int resultado =a/b;
            System.out.println("El resultado es "+ resultado);
        } catch (Exception e) {
            /*
            punto 1.
            System.out.println("Se ha producido un error");
             */
            //punto 2.
            throw new IllegalArgumentException("No se puede dividir por cero");

        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
