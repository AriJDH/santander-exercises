package com.santander.bootcamp.ejercicio1.models;

public class PersonalMantenimiento extends Personal {
    public PersonalMantenimiento(String nombre, String apellido, String dni, String legajo) {
        super(nombre, apellido, dni, legajo);
    }

    @Override
    public void trabajar() {
        System.out.println("El personal de mantenimiento trabajo");
    }
}
