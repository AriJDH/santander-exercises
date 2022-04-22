package com.santander.modelos;

import com.santander.interfaces.IServicioTecnico;

public class EstudianteTecnico extends Estudiante implements IServicioTecnico {

    public EstudianteTecnico(String nombre, String dni, int legajo) {
        super(nombre, dni, legajo);
    }

    @Override
    public void reparacion_pc() {
        System.out.println("Reparación de PC por parte del estudiante.");
    }
}
