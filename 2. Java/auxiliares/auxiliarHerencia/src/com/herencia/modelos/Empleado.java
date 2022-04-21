package com.herencia.modelos;

public class Empleado extends Persona {

    private String legajo;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, String apellido, String fechaNacimiento, String grupSang, String legajo, double sueldo) {
        super(dni, nombre, apellido, fechaNacimiento, grupSang);
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
        return "Emeplado " + super.toString() + " legajo " + this.getLegajo() + " sueldo " + this.getSueldo();

        /*return "Empleado{" +
                "legajo='" + legajo + '\'' +
                ", sueldo=" + sueldo +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", grupSang='" + grupSang + '\'' +
                '}';*/
    }
}
