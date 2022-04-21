package com.santander.bootcamp.ejercicio1.models;

public abstract class Personal extends Persona{
    protected String legajo;

    public Personal(String nombre, String apellido, String dni, String legajo) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
    }

    public abstract void trabajar();
}
