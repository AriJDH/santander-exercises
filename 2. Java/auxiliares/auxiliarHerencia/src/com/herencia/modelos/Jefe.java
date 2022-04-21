package com.herencia.modelos;

import java.util.ArrayList;
import java.util.List;

public class Jefe extends Encargado{

    private List<Encargado> encargados = new ArrayList<>();

    public Jefe() {
    }

    public Jefe(String dni, String nombre, String apellido, String fechaNacimiento, String grupSang, String legajo, double sueldo, List<Empleado> empleados, List<Encargado> encargados) {
        super(dni, nombre, apellido, fechaNacimiento, grupSang, legajo, sueldo, empleados);
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
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", grupSang='" + grupSang + '\'' +
                '}';
    }
}
