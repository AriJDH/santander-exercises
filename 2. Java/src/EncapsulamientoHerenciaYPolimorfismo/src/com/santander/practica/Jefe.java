package com.santander.practica;

import java.util.List;

public class Jefe extends Empleado {
    private List<Encargado> encargadosACargo;

    public Jefe(String dni, String nombre, String apellido, String fechaNac, String grupoSanguíneo, double sueldo, String numeroLegajo, List<Encargado> encargadosACargo) {
        super(dni, nombre, apellido, fechaNac, grupoSanguíneo, sueldo, numeroLegajo);
        this.encargadosACargo = encargadosACargo;
    }

    public List<Encargado> getEncargadosACargo() {
        return encargadosACargo;
    }

    public void setEncargadosACargo(List<Encargado> encargadosACargo) {
        this.encargadosACargo = encargadosACargo;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "sueldo=" + sueldo +
                ", numeroLegajo='" + numeroLegajo + '\'' +
                ", encargadosACargo=" + encargadosACargo +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", grupoSanguíneo='" + grupoSanguíneo + '\'' +
                '}';
    }
}
