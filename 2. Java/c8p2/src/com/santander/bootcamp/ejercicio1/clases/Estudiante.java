package com.santander.bootcamp.ejercicio1.clases;

import com.santander.bootcamp.ejercicio1.clases.Persona;

public class Estudiante extends Persona {

    int libreta;

    public Estudiante(int dni, String nombre, int libreta) {
        super(dni, nombre);
        this.libreta = libreta;
    }

    public void asistirAClases(){
        System.out.println("El alumno asistió a clases :)");
    }

}

