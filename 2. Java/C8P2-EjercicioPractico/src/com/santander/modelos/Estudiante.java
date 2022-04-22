package com.santander.modelos;

public class Estudiante extends Persona{
    private int legajo;

    public Estudiante(String nombre, String dni, int legajo) {
        super(nombre, dni);
        this.legajo = legajo;
    }
}
