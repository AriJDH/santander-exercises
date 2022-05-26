package com.santander.bootcamp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

    Biblioteca b = new Biblioteca();

    b.libros.add("Libro1");
    b.libros.add("Libro2");
    b.libros.add("Libro3");
    b.libros.add("Libro4");

    try{
        b.prestarLibro();
        b.prestarLibro();
        b.prestarLibro();
        b.prestarLibro();
        b.prestarLibro();
    } catch (...)


    }

}

