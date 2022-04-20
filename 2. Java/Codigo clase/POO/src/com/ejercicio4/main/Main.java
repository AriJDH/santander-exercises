package com.ejercicio4.main;

import com.ejercicio4.clases.Libro;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libro libro1= new Libro();
        List<String> autores=new LinkedList<>();
        libro1.setAutores(autores);
        libro1.setNombre("Algo");
        System.out.println(libro1.mostrarInformacion());
        Libro.info();
    }
}
