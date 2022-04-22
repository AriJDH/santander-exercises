package com.santanderbootcamp.C7P2.Ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
    public void leerArchivo(String nombreArchivo) {
        String texto = null;

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
            try {
                while((texto = bufferedReader.readLine()) != null) {
                    System.out.println(texto);
                }
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error al leer el archivo especificado");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo especificado");
        }
    }
}
