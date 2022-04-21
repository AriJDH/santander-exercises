package com.santander.bootcamp.ejercicio1.models;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}
