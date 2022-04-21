package com.santander.bootcamp.ejercicio1.clases;

import java.util.function.DoubleToIntFunction;

public class EstudianteTecnico extends  Estudiante implements Soporte {
    public EstudianteTecnico(int dni, String nombre, int libreta) {
        super(dni, nombre, libreta);
    }

    @Override
    public void darSoporte() {
        System.out.println("El Estudiante técnico dió soporte");
    }
}
