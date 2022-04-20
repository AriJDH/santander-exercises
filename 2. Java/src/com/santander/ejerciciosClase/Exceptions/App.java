package com.santander.ejercicioPOO.ejerciciosClase.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) {



        try{
           FileInputStream fileInputStream = new FileInputStream(("algo"));
       } catch (FileNotFoundException e){
           System.out.println("No se encontro el archivo");
       }
    }
}
