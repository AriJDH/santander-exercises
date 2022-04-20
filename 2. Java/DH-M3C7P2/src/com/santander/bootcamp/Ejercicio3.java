package com.santander.bootcamp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        leerArchivo(".\\src\\com\\santander\\bootcamp\\texto.txt");
    }

    public static void leerArchivo(String nombreArchivo) {
        String texto = null;

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(nombreArchivo));

            // Para que lance la IOException
            // bufferedReader.close();

            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo especificado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo especificado");
        }
    }
}
