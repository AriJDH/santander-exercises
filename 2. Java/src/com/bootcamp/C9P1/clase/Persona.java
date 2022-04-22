package com.bootcamp.C9P1.clase;

public class Persona {
    private final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public boolean tiene_nombre(String nombre) {
        return this.nombre.equals(nombre);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
