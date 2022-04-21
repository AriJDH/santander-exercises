package com.clasesYHerencias.modelos;

public class Empleado extends Persona{
    protected double sueldo;
    protected int legajo;


    public Empleado(String dni, String nombre, String apellido,
                    String fechaNac, String grupoSang, double sueldo, int legajo) {
        super(dni, nombre, apellido, fechaNac, grupoSang);
        this.sueldo = sueldo;
        this.legajo = legajo;
    }

    private int getLegajo() {
        return legajo;
    }

    private double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + " legajo= '" + this.getLegajo() + "', sueldo=" + this.getSueldo() + "}";
    }
}
