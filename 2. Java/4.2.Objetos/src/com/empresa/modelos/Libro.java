package com.empresa.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Libro {

    private String nombre;
    private List<Autor> autores;
    private Map<Integer,List<Autor>> autoresPorCapitulo;
    private int cantidadHojas;

    public Libro() {
    }

    public Libro(String nombre, List<Autor> autores, Map<Integer, List<Autor>> autoresPorCapitulo, int cantidadHojas) {
        this.nombre = nombre;
        this.autores = autores;
        this.autoresPorCapitulo = autoresPorCapitulo;
        this.cantidadHojas = cantidadHojas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
