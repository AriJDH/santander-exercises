package com.santander.bootcamp.modelos;

import java.util.HashMap;
import java.util.List;

public class Libro {

    private String autor;
    private String nombre;

    private HashMap<Integer, List> mapa;

    public Libro() {
        this.mapa = new HashMap<>();
    }

    public List obtenerAutores(int capitulo){
        return mapa.get(capitulo);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Integer, List> getMapa() {
        return mapa;
    }

    public void setMapa(int capitulo, List autores) {
        mapa.put(capitulo, autores);
    }


}
