package com.santander.practica;

public class Empleado extends Persona {
    protected double sueldo;
    protected String numeroLegajo;

    public Empleado(String dni, String nombre, String apellido, String fechaNac, String grupoSanguíneo, double sueldo, String numeroLegajo) {
        super(dni, nombre, apellido, fechaNac, grupoSanguíneo);
        this.sueldo = sueldo;
        this.numeroLegajo = numeroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(String numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldo=" + sueldo +
                ", numeroLegajo='" + numeroLegajo + '\'' +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", grupoSanguíneo='" + grupoSanguíneo + '\'' +
                '}';
    }
}
