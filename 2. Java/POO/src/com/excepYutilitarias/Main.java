package com.excepYutilitarias;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void leerArchivo(String nombreArchivo) {
        try {
            String texto = null;

            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));

            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo..");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo especificado");
        }
    }

    public static void main(String[] args) {
        PracticaExc e1 = new PracticaExc();

        //Mensaje final
        String mensajeFinal = "Este es el último mensaje";

        //Código que arroja excepción
        try {
            int[] numeros = new int[5];
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ingreso a una posición inexistente");
        } finally {
            System.out.println(mensajeFinal);
        }

        leerArchivo("jose.txt");

    }


}
