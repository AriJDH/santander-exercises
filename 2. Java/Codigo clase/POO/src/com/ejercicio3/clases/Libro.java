package com.ejercicio3.clases;

import java.util.List;

public class Libro {
    private List<String> autores;
    private String nombre;

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
