package com.pruebas.prueba1.clases;

import java.util.List;

public class Encargado extends Empleado{
    private List<Empleado>empleados;

    public Encargado(String dni, String nombre, String apellido, String fechaDeNacimiento, String grupoSanguineo, double sueldo, String rango, int legajo, List<Empleado> empleados) {
        super(dni, nombre, apellido, fechaDeNacimiento, grupoSanguineo, sueldo, rango, legajo);
        this.empleados = empleados;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "empleados=" + empleados +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                "} " + super.toString();
    }
}
