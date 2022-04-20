package com.ejercicio3.main;

import com.ejercicio3.clases.Libro;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Libro libro1= new Libro();
        List<String> autores=new LinkedList<>();
        libro1.setAutores(autores);
        libro1.setNombre("nombre");
        System.out.println(libro1.mostrarInformacion());
    }
}
