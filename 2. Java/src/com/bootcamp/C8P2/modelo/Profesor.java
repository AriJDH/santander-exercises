package com.bootcamp.C8P2.modelo;

import com.bootcamp.C8P2.interfaces.IClase;

public class Profesor extends MiembroPersonal implements IClase {
    public Profesor(String nombre, String dni, String legajo) {
        super(nombre, dni, legajo);
    }

    @Override
    public void dar_clases() {
        System.out.println("Profesor da clases");
    }
}
