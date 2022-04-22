package com.santander.modelos;

import com.santander.interfaces.IClase;

public class Profesor extends MiembroPersonal implements IClase {
    private String materia;

    public Profesor(String nombre, String dni) {
        super(nombre, dni);
        this.materia = materia;
    }

    @Override
    public void clases_de_matematicas() {
        System.out.println("Profesor dió clases de Matemáticas");
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "materia='" + materia + '\'' +
                '}';
    }
}
