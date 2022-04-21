package com.pruebas.prueba1.clases;

import java.util.List;

public class Jefe extends Empleado{
    List<Encargado>encargados;

    public Jefe(String dni, String nombre, String apellido, String fechaDeNacimiento, String grupoSanguineo, double sueldo, String rango, int legajo, List<Encargado> encargados) {
        super(dni, nombre, apellido, fechaDeNacimiento, grupoSanguineo, sueldo, rango, legajo);
        this.encargados = encargados;
    }

    public List<Encargado> getEncargados() {
        return encargados;
    }

    public void setEncargados(List<Encargado> encargados) {
        this.encargados = encargados;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "encargados=" + encargados +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                "} " + super.toString();
    }


}
