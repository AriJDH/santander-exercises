package com.resolucion.ejercicio_2.main;

public class Main {
    public static void main(String[] args) {

        //Mensaje final
        String mensajeFinal = "Este es el último mensaje";
        int[] numeros = new int[5];


        try {
            //Código que arroja excepción
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println(mensajeFinal);
        }

    }
}
