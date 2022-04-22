package com.santanderbootcamp.C8P2.Ejercicio1.modelos;

public class PersonalMantenimiento extends MiembroDelPersonal{

    public PersonalMantenimiento(String dni, String nombre, String apellido, String fechaNacimiento, String legajo, String fechaIncorporacion, double sueldo) {
        super(dni, nombre, apellido, fechaNacimiento, legajo, fechaIncorporacion, sueldo);
    }

    public void darMantenimiento() {
        System.out.println("Se ha dado mantenimiento");
    }

    public void realizarInforme() {
        System.out.println("Se ha realizado un informe con lo que hay reparar");
    }

}
