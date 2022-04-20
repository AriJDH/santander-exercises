package com.santander.bootcamp.ejercicios;

public class Ejercicio1 {

    public static void Ejecutar(){
        int a = 0;
        int b = 300;

        /*
        1.

        try{
            double calculo = b/a;
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error");
        } */

        try{
            double calculo = b/a;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        System.out.println("Programa finalizado");

    }
}
