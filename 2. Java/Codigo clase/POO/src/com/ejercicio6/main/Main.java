package com.ejercicio6.main;

import com.ejercicio6.clases.Libro;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Agregar listas de autores por capitulo
        HashMap<Integer,List<String>>contenido=new HashMap<>();
        List <String> autoresCap1= new LinkedList<>();
        autoresCap1.add("Pepito");
        List <String> autoresCap2= new LinkedList<>();
        autoresCap2.add("Pablito");
        autoresCap2.add("Juancito");
        List <String> autoresCap3= new LinkedList<>();
        autoresCap3.add("Tatiana");

        contenido.put(1,autoresCap1);
        contenido.put(2,autoresCap2);
        contenido.put(3,autoresCap3);
        Libro libro= new Libro(contenido);

        System.out.println("CAPITULO 1");
        System.out.println(libro.devolverAutores(1));
        System.out.println("CAPITULO 2");
        System.out.println(libro.devolverAutores(2));
        System.out.println("CAPITULO 3");
        System.out.println(libro.devolverAutores(3));


    }
}
