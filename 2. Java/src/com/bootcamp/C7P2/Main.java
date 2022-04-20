package com.bootcamp.C7P2;

public class Main {
    public static void main(String[] args) {
        //ejercicio_1();
        ejercicio_2();
    }

    private static void ejercicio_2() {
        //Mensaje final
        String mensajeFinal = "Este es el último mensaje";

        //Código que arroja excepción
        int[] numeros = new int[5];
        try {
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println(mensajeFinal);
    }

    public static void ejercicio_1() {
        PracticaExcepciones practicaExcepciones = new PracticaExcepciones();
        practicaExcepciones.ejecutar();
        practicaExcepciones.ejecutar_con_excepcion();
    }
}
