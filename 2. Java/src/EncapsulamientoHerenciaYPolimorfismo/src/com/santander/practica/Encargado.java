package com.santander.practica;

import java.util.List;

public class Encargado extends Empleado {
    private List<Empleado> empleadosACargo;

    public Encargado(String dni, String nombre, String apellido, String fechaNac, String grupoSanguíneo, double sueldo, String numeroLegajo, List<Empleado> empleadosACargo) {
        super(dni, nombre, apellido, fechaNac, grupoSanguíneo, sueldo, numeroLegajo);
        this.empleadosACargo = empleadosACargo;
    }

    public List<Empleado> getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void setEmpleadosACargo(List<Empleado> empleadosACargo) {
        this.empleadosACargo = empleadosACargo;
    }

    @Override
    public String toString() {
        return "Encargado{" +
                "sueldo=" + sueldo +
                ", numeroLegajo='" + numeroLegajo + '\'' +
                ", empleadosACargo=" + empleadosACargo +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", grupoSanguíneo='" + grupoSanguíneo + '\'' +
                '}';
    }
}
