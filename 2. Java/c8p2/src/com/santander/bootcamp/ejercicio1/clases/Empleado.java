package com.santander.bootcamp.ejercicio1.clases;

import com.santander.bootcamp.ejercicio1.clases.Persona;

import java.util.Date;

public  abstract class Empleado extends Persona {
    int legajo;
    Date fechaIngreso;

    public Empleado(int dni, String nombre, int legajo, Date fechaIngreso) {
        super(dni, nombre);
        this.legajo = legajo;
        this.fechaIngreso = fechaIngreso;
    }
}






