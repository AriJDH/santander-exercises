package com.santanderbootcamp.C8P2.Ejercicio1.modelos;

import com.santanderbootcamp.C8P2.Ejercicio1.interfaces.Tecnico;

public class EstudianteTecnico extends Estudiante implements Tecnico {

    public EstudianteTecnico(String dni, String nombre, String apellido, String fechaNacimiento) {
        super(dni, nombre, apellido, fechaNacimiento);
    }

    @Override
    public void atenderReclamo() {
        System.out.println("El estudiante técnico ha atendido el reclamo.");
    }
}
