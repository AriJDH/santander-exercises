package com.santander.bootcamp.ejercicio1.clases;

import java.util.Date;
import java.util.List;

public class Profesor extends Empleado implements Enseniar {

    public Profesor(int dni, String nombre, int legajo, Date fechaIngreso) {
        super(dni, nombre, legajo, fechaIngreso);
    }

    @Override
    public void dictarClases() {
        System.out.println("El profesor dictó clases :)");
    }
}
