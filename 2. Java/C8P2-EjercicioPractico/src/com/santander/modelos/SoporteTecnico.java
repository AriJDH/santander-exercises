package com.santander.modelos;

import com.santander.interfaces.IServicioTecnico;

public class SoporteTecnico extends Persona implements IServicioTecnico {

    public SoporteTecnico(String nombre, String dni) {
        super(nombre, dni);
    }

    public void reparacion_pc (){
        System.out.println("El soporte técnico profesional reparo la pc");
    }
}
