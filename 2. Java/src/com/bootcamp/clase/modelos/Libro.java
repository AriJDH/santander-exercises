package com.bootcamp.clase.modelos;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    public String nombre;
    public List<Autor> autores;

    public Libro() {}

    public Libro(String nombre, String autor) {
        this.nombre = nombre;
        this. autores = new ArrayList<>();
    }

    public static void info() {
        System.out.println("Es un libro");
    }

    public String mostrar_info() {
        return "nombre " + nombre + " autores " + autores;
    }

    public void agregar_autores(List<Autor> autores) {
        this.autores.addAll(autores);
    }
}
