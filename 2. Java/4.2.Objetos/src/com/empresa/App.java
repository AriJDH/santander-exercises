package com.empresa;


import com.empresa.modelos.Persona;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args)  {


        Persona persona = null;
        String[] palabras = {"algo"};

        try {
            /*
            System.out.println(persona.toString());
            int numero = 0;
            int respuesta = 10/0;
             */
            System.out.println(palabras[1]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Terminar procesos");
        }

        /*
        try {
            FileInputStream fileInputStream = new FileInputStream("algun texto");
        } catch (FileNotFoundException e) {
            //System.out.println("No se encontro el archivo");
            e.printStackTrace();
        }
        */

        System.out.println("El programa termina ok !!!");
    }
}
