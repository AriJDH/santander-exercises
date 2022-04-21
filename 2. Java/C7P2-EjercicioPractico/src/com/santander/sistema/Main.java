package com.santander.sistema;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        PracticaExcepciones practicaExcepciones = new PracticaExcepciones();

        //EJERCICIO1 ------------------------------
        /*try {
            practicaExcepciones.calcular_cociente();
        }
        catch (Exception e){
            System.out.println("Se ha producido un error.");
        }
        System.out.println("Programa Finalizado");*/

        //Punto2
        /*try {
            practicaExcepciones.calcular_cociente();
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Programa Finalizado");
        }*/

        //EJERCICIO2 ----------------------------------------------------------------------------------------
        String mensajeFinal = "Este es el último mensaje";

        //Código que arroja excepción

        /*try {
            int[] numeros = new int[5];
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error fuera de rango");
        }finally {
            System.out.println(mensajeFinal);
        }*/

        //EJERCICIO 4 --------------------------------------------------------------------------------
        Calculo calculo = new Calculo();
        System.out.println(calculo.mayor(4,6));
        System.out.println(calculo.menor(10,0));
        System.out.println(calculo.potencia(3,2));
        System.out.println(calculo.coseno(80));
        System.out.println(calculo.raiz_cuadrada(7));
        System.out.println(calculo.aleatorio());
    }

    //EJERCICIO 3 -------------------------------------------------------------------------------------
    public void leerArchivo(String nombreArchivo) throws IOException {
        String texto = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            System.out.println("No se puede encontrar el archivo especificado.");
        }

        BufferedReader bufferedReader = null;
        try {
            while((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
        }catch (IOException a){
            bufferedReader.close();
        }finally {
            System.out.println("Error al leer el archivo especificado.");
        }
    }
}
