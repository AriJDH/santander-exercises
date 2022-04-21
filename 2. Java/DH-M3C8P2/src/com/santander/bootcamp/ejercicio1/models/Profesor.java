package com.santander.bootcamp.ejercicio1.models;

public class Profesor extends Personal implements Educacion {
    public Profesor(String nombre, String apellido, String dni, String legajo) {
        super(nombre, apellido, dni, legajo);
    }

    @Override
    public void trabajar() {
        System.out.println("El profesor trabajo");
    }

    @Override
    public void educar() {
        System.out.println("El profesor educo");
    }
}
