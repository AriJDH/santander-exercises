package com.empresa.modelos;

import java.util.ArrayList;
import java.util.List;

public class Jefe extends Empleado{

    private List<Encargado>  encargados = new ArrayList<>();

    public Jefe(String dni, String nombre, String apellido, String fechaNac, String grupoSang, String legajo, double sueldo, List<Encargado> encargados) {
        super(dni, nombre, apellido, fechaNac, grupoSang, legajo, sueldo);
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
                '}';
    }
}
