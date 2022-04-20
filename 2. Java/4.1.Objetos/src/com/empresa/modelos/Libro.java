package com.empresa.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Libro {

    private String nombre;
    private List<Autor> autores;
    private Map<Integer,List<Autor>> autoresPorCapitulo;

    // private List<Capitulo>

    public static void info() {
        System.out.println("Es un libro");
    }

    public Libro() {
        this.autores = new ArrayList<>();
    }

    public Libro(String nombre, List<Autor> autores) {
        this.setNombre(nombre);
        this.setAutores(autores);
    }

    public String mostrarInfo() {
        return "Nombre del libro " + nombre + " Autores " + autores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
}
