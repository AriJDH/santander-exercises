package com.Ejercicio2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {

        PracticaExcepciones practicaExcepciones = new PracticaExcepciones();
        try {
            System.out.println(practicaExcepciones.calcularDivision());

        }catch (IllegalArgumentException e){

            e.printStackTrace();

        } finally {
            System.out.println("Programa finalizado");
        }

        System.out.println("******");

        String mensajeFinal = "Este es el último mensaje";
       //Código que arroja excepción
        int[] numeros = new int[5];


        try {
            numeros[5] = 10;

        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("El size es incorrecto");

        } finally {
            System.out.println(mensajeFinal);
        }

        System.out.println("******");

        try {
            practicaExcepciones.leerArchivo("");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("*****");
        Calculos calculos = new Calculos();
        System.out.println(calculos.mayor());
        System.out.println(calculos.menor());
        System.out.println(calculos.potencia());
        System.out.println(calculos.raiz());
        System.out.println(calculos.aleatorio());


    }


}
