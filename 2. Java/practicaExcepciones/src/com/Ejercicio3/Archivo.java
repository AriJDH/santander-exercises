package com.Ejercicio3;

import java.io.*;

public class Archivo {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public static void leerArchivo(String nombreArchivo) {
        String texto = "asdf";
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(nombreArchivo));

            try {
                while((texto = bufferedReader.readLine()) != null) {
                    System.out.println(texto);
                }

                bufferedReader.close();
            } catch (IOException var4) {
                System.out.println("Error al leer el archivo especificado");
            }
        } catch (FileNotFoundException var5) {
            System.out.println("No se puede encontrar el archivo especificado");
        }

    }
}
