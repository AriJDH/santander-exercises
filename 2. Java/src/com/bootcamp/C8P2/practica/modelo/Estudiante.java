package com.bootcamp.C8P2.practica.modelo;

public class Estudiante extends Persona {
    private String padron;

    public Estudiante(String nombre, String dni, String padron) {
        super(nombre, dni);
        this.padron = padron;
    }

}
