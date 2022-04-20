package com.ejercicio6.clases;

import java.util.HashMap;
import java.util.List;

public class Libro {
    private HashMap<Integer,List<String>> contenido;

    public Libro(HashMap<Integer, List<String>> contenido) {
        this.contenido = contenido;
    }

    public HashMap<Integer, List<String>> getContenido() {
        return contenido;
    }

    public void setContenido(HashMap<Integer, List<String>> contenido) {
        this.contenido = contenido;
    }

    public List<String> devolverAutores(int capitulo){
        return contenido.get(capitulo);
    }


    @Override
    public String toString() {
        return "Libro{" +
                "contenido=" + contenido +
                '}';
    }
}
