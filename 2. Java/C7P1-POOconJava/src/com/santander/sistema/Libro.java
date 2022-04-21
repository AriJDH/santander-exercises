package com.santander.sistema;

import com.santander.sistema.Autor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Libro {
    public String nombre;
    public List<Autor> autores;
    private HashMap<Integer,List<Autor>> autoresPorCapitulo;

    public Libro(String nombre, List<Autor> autores, HashMap<Integer, List<Autor>> autoresPorCapitulo) {
        this.nombre = nombre;
        this.autores = autores;
        this.autoresPorCapitulo = autoresPorCapitulo;
    }

    public static void info() {
        System.out.println("Es un libro");
    }
    /*public Libro() {
        this.autores = new ArrayList<>();
    }

    public Libro(String nombre, List<Autor> autores) {
        this.setNombre(nombre);
        this.setAutores(autores);
    }*/

    public String mostrarInfo() {
        return nombre + " " + autores + " " + autoresPorCapitulo;
    }
    //getter
    public String getNombre() {return nombre;}
    public List<Autor> getAutores() {return autores;}
    public HashMap<Integer, List<Autor>> getAutoresPorCapitulo() {return autoresPorCapitulo;}

    //setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setAutores(List<Autor> autores) {this.autores = autores;}
    public void setAutoresPorCapitulo(HashMap<Integer, List<Autor>> autoresPorCapitulo) {
        this.autoresPorCapitulo = autoresPorCapitulo;
    }

    public List<Autor> devolver_autores(int capitulo) {
        return autoresPorCapitulo.get(capitulo);
    }
}
