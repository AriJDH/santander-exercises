package com.herencia.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Encargado extends Empleado{

    private List<Empleado> empleados = new ArrayList<>();

    public Encargado() {
    }

    public Encargado(String dni, String nombre, String apellido, String fechaNacimiento, String grupSang, String legajo, double sueldo, List<Empleado> empleados) {
        super(dni, nombre, apellido, fechaNacimiento, grupSang, legajo, sueldo);
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
        return "Encargado{" +
                "empleados=" + empleados +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", grupSang='" + grupSang + '\'' +
                '}';
    }
}
