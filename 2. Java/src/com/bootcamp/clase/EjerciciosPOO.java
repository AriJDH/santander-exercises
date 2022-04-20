package com.bootcamp.clase;

import com.bootcamp.clase.modelos.Autor;
import com.bootcamp.clase.modelos.Libro;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosPOO {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Don Quijote", "Juan");

        //aliasing
        Libro libro2 = libro1;
        //libro2.autores = "Carlos";

        Libro.info();

        List<Autor> autores = new ArrayList<>();
        Autor autor = new Autor("Juan", "el barto");
        autores.add(autor);
        libro1.agregar_autores(autores);
        System.out.println(libro1.mostrar_info());

        libro1.mostrar_info();
    }
}
