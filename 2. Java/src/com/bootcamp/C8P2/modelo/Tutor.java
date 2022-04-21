package com.bootcamp.C8P2.modelo;

import com.bootcamp.C8P2.interfaces.IClase;

public class Tutor extends Estudiante implements IClase {
    public Tutor(String nombre, String dni, String padron) {
        super(nombre, dni, padron);
    }

    @Override
    public void dar_clases() {
        System.out.println("Tutor da clases");
    }
}
