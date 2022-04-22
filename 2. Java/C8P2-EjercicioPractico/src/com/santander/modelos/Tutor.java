package com.santander.modelos;

import com.santander.interfaces.IClase;

public class Tutor extends Estudiante implements IClase {

    public Tutor(String nombre, String dni, int legajo) {
        super(nombre, dni, legajo);
    }

    @Override
    public void clases_de_matematicas() {
        System.out.println("Clases de apoyo del tutor de matemáticas");
    }
}
