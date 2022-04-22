package com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio1.modelos;

import com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio1.interfaces.Tecnico;

import java.util.HashMap;
import java.util.List;

public class EstudianteTecnico extends Estudiante implements Tecnico {

    public EstudianteTecnico(String dni, String nombre, String apellido, String fechaNacimiento) {
        super(dni, nombre, apellido, fechaNacimiento);
    }

    @Override
    public void atenderReclamo() {
        System.out.println("El estudiante técnico ha atendido el reclamo.");
    }
}
