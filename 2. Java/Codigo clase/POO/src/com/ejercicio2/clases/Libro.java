package com.ejercicio2.clases;

import java.util.List;

public class Libro {
    public List<String> autores;
    public String nombre;

    public String mostrarInformacion(){
        return "Nombre del autor: "+autores+ " | Nombre del libro: "+nombre;
    }
}
