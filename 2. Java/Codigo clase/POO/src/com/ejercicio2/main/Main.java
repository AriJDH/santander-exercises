package com.ejercicio2.main;

import com.ejercicio2.clases.Libro;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Libro libro1= new Libro();
        List<String> autores=new LinkedList<>();
        libro1.autores=autores;
        libro1.nombre="Algo";
        System.out.println(libro1.mostrarInformacion());
    }
}
