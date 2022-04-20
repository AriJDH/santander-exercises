package com.resolucion.ejercicio_1.main;

import com.resolucion.ejercicio_1.clases.PracticaExcepciones;

public class Main {
    public static void main(String[] args) {
        PracticaExcepciones practicaExcepciones= new PracticaExcepciones();
        /*
        punto 1.
        practicaExcepciones.calcularCociente();
         */
        //punto 2.
        try{
            practicaExcepciones.calcularCociente();
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }


    }
}
