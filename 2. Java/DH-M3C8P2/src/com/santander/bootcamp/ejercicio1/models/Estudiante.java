package com.santander.bootcamp.ejercicio1.models;

public class Estudiante extends Persona {
    protected String libreta;

    public Estudiante(String nombre, String apellido, String dni, String libreta) {
        super(nombre, apellido, dni);
        this.libreta = libreta;
    }

    public void asistir() {
        System.out.println("El estudiante asistio a clases");
    }
}
