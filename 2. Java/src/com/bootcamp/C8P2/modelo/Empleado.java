package com.bootcamp.C8P2.modelo;

public class Empleado extends Persona {
    private String legajo;

    public Empleado(String nombre, String dni, String legajo) {
        super(nombre, dni);
        this.legajo = legajo;
    }

}
