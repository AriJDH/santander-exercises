package com.bootcamp.C8P2.practica.modelo;

import com.bootcamp.C8P2.practica.interfaces.IServicioTecnico;

public class EstudianteTecnico extends Estudiante implements IServicioTecnico {
    public EstudianteTecnico(String nombre, String dni, String padron) {
        super(nombre, dni, padron);
    }

    @Override
    public void dar_servicio_tecnico() {
        System.out.println("Estudiante tecnico da servicio tecnico");
    }
}
