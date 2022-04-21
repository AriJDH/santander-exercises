package com.santander.bootcamp.ejercicio1.models;

public class PersonalSoporteTecnico extends Personal implements SoporteTecnico {
    public PersonalSoporteTecnico(String nombre, String apellido, String dni, String legajo) {
        super(nombre, apellido, dni, legajo);
    }

    @Override
    public void trabajar() {
        System.out.println("El personal de soporte tecnico trabajo");
    }

    @Override
    public void arreglar() {
        System.out.println("El personal de soporte tecnico arreglo algo");
    }
}
