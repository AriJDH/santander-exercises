package com.bootcamp.C7P2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //ejercicio_1();
        //ejercicio_2();

        /*ejercicio 3*/
        leerArchivo("nombre random");
    }

    private static void leerArchivo(String nombreArchivo) {
        String texto = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader((nombreArchivo)));
            while((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo especificado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo especificado");
        }


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
