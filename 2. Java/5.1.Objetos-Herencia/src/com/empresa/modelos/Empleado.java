package com.empresa.modelos;

public class Empleado extends Persona{

    private String legajo;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, String apellido, String fechaNac, String grupoSang, String legajo, double sueldo) {
        super(dni, nombre, apellido, fechaNac, grupoSang);
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "legajo='" + legajo + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
