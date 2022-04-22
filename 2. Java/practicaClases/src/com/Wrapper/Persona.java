package com.Wrapper;

import java.util.ArrayList;
import java.util.List;

public class Persona implements Dao<Persona,String>{
    private String nombre;
    private String apellido;

    ArrayList<Persona> personas = new ArrayList<>();

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public Persona buscarElemento(String key) {
        return null;
    }

    @Override
    public List<Persona> Listar() {
        return this.personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
