package com.santanderbootcamp.C8P2.Ejercicio1.modelos;

import com.santanderbootcamp.C8P2.Ejercicio1.interfaces.Instructor;

public class Tutor extends Estudiante implements Instructor {
    public Tutor(String dni, String nombre, String apellido, String fechaNacimiento) {
        super(dni, nombre, apellido, fechaNacimiento);
    }

    @Override
    public void enseniarA(Estudiante estudiante) {
        System.out.println("El tutor le enseño a " + estudiante.getNombre() + " " + estudiante.getApellido());
    }
}