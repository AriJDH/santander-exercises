package com.santanderbootcamp.C8P2.Ejercicio1.modelos;

import com.santanderbootcamp.C8P2.Ejercicio1.interfaces.Tecnico;

public class PersonalSoporteTecnico extends MiembroDelPersonal implements Tecnico {

    public PersonalSoporteTecnico(String dni, String nombre, String apellido, String fechaNacimiento, String legajo, String fechaIncorporacion, double sueldo) {
        super(dni, nombre, apellido, fechaNacimiento, legajo, fechaIncorporacion, sueldo);
    }

    @Override
    public void atenderReclamo() {
        System.out.println("El personal de servicio técnico ha atendido el reclamo.");
    }
}
