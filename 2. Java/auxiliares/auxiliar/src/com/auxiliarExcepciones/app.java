package com.auxiliarExcepciones;

import com.auxiliarExcepciones.modelos.biblioteca;
import com.auxiliarExcepciones.modelos.bibliotecaException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class app {
    public static void main(String[] args) {


        /*biblioteca bi = new biblioteca(10);
        try {
            bi.prestar();
        }
        catch (bibliotecaException e) {
            System.out.println(e);
        }*/

        /*try {
            int valor = 0;
            double resultado = 10 / valor;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Terminar procesos.");
        }*/

        /*try {
            FileInputStream fileInputStream = new FileInputStream("Algun texto");
        } catch (FileNotFoundException e) {
            System.out.println("no se encontró el archivo");
            e.printStackTrace();
        }*/

        System.out.println("El programa termina ok!");
    }
}
