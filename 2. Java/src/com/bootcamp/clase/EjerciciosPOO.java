package com.bootcamp.clase;

import com.bootcamp.C6P2.Persona;
import com.bootcamp.clase.modelos.Autor;
import com.bootcamp.clase.modelos.Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EjerciciosPOO {
    public static void main(String[] args) {
        ejercicio_capitulos();
    }

    public static void ejercicio_libro() {
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

    public static void ejercicio_capitulos() {
        Libro libro = new Libro("Don Quijote", "Juan");

        List<Autor> autores = new ArrayList<>();
        Autor autor = new Autor("Juan", "el barto");
        Autor autor_2 = new Autor("Martin", "esio");
        autores.add(autor);
        autores.add(autor_2);

        libro.agregar_autores_a_capitulo(10, autores);
        libro.agregar_autores_a_capitulo(20, autores);

        libro.mostrar_autores_por_capitulo();

    }
}
