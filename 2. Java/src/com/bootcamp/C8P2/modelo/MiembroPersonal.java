package com.bootcamp.C8P2.modelo;

public class MiembroPersonal extends Persona {
    private String legajo;

    public MiembroPersonal(String nombre, String dni, String legajo) {
        super(nombre, dni);
        this.legajo = legajo;
    }

}
