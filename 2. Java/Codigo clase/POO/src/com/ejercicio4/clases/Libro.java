package com.ejercicio4.clases;

import java.util.List;

public class Libro {
    private List<String> autores;
    private String nombre;

    //Metodo estatico: puedo usarlo sin instanciar. Esto lo uso para no crear instancia y no hacer que mi programa consuma muchos recursos
    public static void info(){
        System.out.println("hola");
    }

    public String mostrarInformacion(){
        return "Nombre del autor: "+autores+ " | Nombre del libro: "+nombre;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
