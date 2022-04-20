package com.auxiliarPOO.uno.modelos;
import java.util.*;

public class Libro {

    private String nombre;
    private List<Autor> autores;
    private int capitulos;
    private HashMap<Integer, List<Autor>> autoresPorCap;


    public Libro(String nombre, List<Autor> autores, int capitulos) {
        this.nombre = nombre;
        this.autores = autores;
        this.capitulos = capitulos;
    }

    public void cargarCapitulo (int cap, List<Autor> lista) {

    }

    public String mostrarInfo(){
        return "Nombre: " + nombre + " Autores: " + autores;
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
