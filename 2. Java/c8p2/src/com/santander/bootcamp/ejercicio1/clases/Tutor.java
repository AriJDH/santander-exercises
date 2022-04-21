package com.santander.bootcamp.ejercicio1.clases;

public class Tutor extends Estudiante implements Enseniar{

    public Tutor(int dni, String nombre, int libreta) {
        super(dni, nombre, libreta);
    }

    @Override
    public void dictarClases() {
        System.out.println("El tutor dictó clases :)");
    }
}
