package com.bootcamp.C8P1.clase.modelos;

import java.util.ArrayList;
import java.util.List;

public class Jefe extends Empleado{

    private List<Empleado> empleados;


    public Jefe(String dni, String nombre, String apellido, String fechaNac, String grupoSang, double sueldo, int legajo, List<Empleado> empleados) {
        super(dni, nombre, apellido, fechaNac, grupoSang, sueldo, legajo);
        this.empleados = empleados;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "empleados=" + empleados +
                ", sueldo=" + sueldo +
                ", legajo=" + legajo +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", grupoSang='" + grupoSang + '\'' +
                '}';
    }
}
