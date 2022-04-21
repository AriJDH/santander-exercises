package com.pruebas.prueba1.clases;

public class Empleado extends Persona{
    private double sueldo;
    private String rango;
    private int legajo;

    public Empleado(String dni, String nombre, String apellido, String fechaDeNacimiento, String grupoSanguineo, double sueldo, String rango, int legajo) {
        super(dni, nombre, apellido, fechaDeNacimiento, grupoSanguineo);
        this.sueldo = sueldo;
        this.rango = rango;
        this.legajo = legajo;

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldo=" + sueldo +
                ", rango='" + rango + '\'' +
                ", legajo=" + legajo +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                '}';
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}
