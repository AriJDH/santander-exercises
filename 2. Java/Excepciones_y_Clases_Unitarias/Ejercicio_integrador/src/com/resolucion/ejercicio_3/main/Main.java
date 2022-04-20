package com.resolucion.ejercicio_3.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //para provocar FileNotFoundException
        //leerArchivo("adfadfaf.pdf");

        //para provocar IOException
        //leerArchivo("src/com/resolucion/ejercicio_3/main/text.txt");
    }

    public static void leerArchivo(String nombreArchivo) {
        String texto = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
        } catch (FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo especificado");
        }
        try {
            //Esto es lo que provoca el error del IOException al no poder ingresar al archivo
            bufferedReader.close();
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo especificado");
        }

    }

}
