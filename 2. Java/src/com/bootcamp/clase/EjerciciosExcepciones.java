package com.bootcamp.clase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EjerciciosExcepciones {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("pureba.txt");
        } catch (FileNotFoundException exception){
            System.out.println("El archivo indicado no existe");
        }
    }
}
