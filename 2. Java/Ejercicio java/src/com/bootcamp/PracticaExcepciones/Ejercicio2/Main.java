package com.bootcamp.PracticaExcepciones.Ejercicio2;

import com.bootcamp.PracticaExcepciones.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        String mensajeFinal = "Este es el último mensaje";
        try{
            int[] numeros = new int[5];
            numeros[5] = 10;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(mensajeFinal);
        }
    }
}
