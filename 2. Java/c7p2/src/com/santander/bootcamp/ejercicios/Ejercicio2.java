package com.santander.bootcamp.ejercicios;

public class Ejercicio2 {

    public static void Ejecutar(){

        //Mensaje final
        String mensajeFinal = "Este es el último mensaje";

        try{
            int[] numeros = new int[5];
            numeros[5] = 10;

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Mensaje de error: " + e.getMessage());

        } finally {
            System.out.println(mensajeFinal);
        }


    }
}
