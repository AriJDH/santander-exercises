package com.santander.bootcamp.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {

    public static void leerArchivo(String nombreArchivo) throws IOException {
        String texto = null;


        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
        } catch (FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo especificado");
            System.out.println(e.getMessage());

        }

        try {
            while((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
        } catch (NullPointerException e) {
            System.out.println("Excepcion en el while:");
            System.out.println(e.getMessage());
        }


        try {
            bufferedReader.close();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
