package com.santander.bootcamp.ejercicio1.models;

public class Tutor extends Estudiante implements Educacion {
    public Tutor(String nombre, String apellido, String dni, String libreta) {
        super(nombre, apellido, dni, libreta);
    }

    @Override
    public void asistir() {
        System.out.println("El tutor asistio a clases");
    }

    @Override
    public void educar() {
        System.out.println("El tutor educo");
    }
}
