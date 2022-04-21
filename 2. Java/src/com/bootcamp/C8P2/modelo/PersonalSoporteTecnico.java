package com.bootcamp.C8P2.modelo;

import com.bootcamp.C8P2.interfaces.IServicioTecnico;

public class PersonalSoporteTecnico extends MiembroPersonal implements IServicioTecnico {
    public PersonalSoporteTecnico(String nombre, String dni, String legajo) {
        super(nombre, dni, legajo);
    }

    @Override
    public void dar_servicio_tecnico() {
        System.out.println("Servicio tecnico da servicio tecnico");
    }
}
