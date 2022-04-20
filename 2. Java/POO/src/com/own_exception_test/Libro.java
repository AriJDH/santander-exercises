package com.own_exception_test;

public class Libro {
    private String nombre;
    public Libro(String nombre){
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
