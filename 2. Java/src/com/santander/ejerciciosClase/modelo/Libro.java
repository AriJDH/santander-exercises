package com.santander.ejercicioPOO.ejerciciosClase.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Libro {
    private String nombre;
    private List<Autor> autores;
    private Map contenido;



    public Libro(){
        this.autores = new ArrayList<>();
    }

    public Libro(String nombre, List<Autor> autores) {
        this.nombre = nombre;
        this.autores = autores;
    }

    public static void info(){
        System.out.println("Es un libro");
    }

    public String mostrarInfo(){
        return "Nombre del libro: "+nombre + "  " + " Autores del Libro:"+autores;
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

    public Map getContenido() {
        return contenido;
    }

    public void setContenido(Map contenido) {
        this.contenido = contenido;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autores=" + autores +
                ", contenido=" + contenido +
                '}';
    }
}
