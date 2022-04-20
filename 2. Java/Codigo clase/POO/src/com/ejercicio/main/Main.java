package com.ejercicio.main;

import com.ejercicio.clases.Libro;

public class Main {
    public static void main(String[] args) {
        Libro libro1= new Libro();
        libro1.autor="Alguien";
        libro1.nombre="Algo";
        System.out.println(libro1.mostrarInformacion());
    }
}
