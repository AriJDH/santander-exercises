package com.santanderbootcamp.C8P2.Ejercicio1.modelos;

public abstract class MiembroDelPersonal extends Persona {
    protected String legajo;
    protected String fechaIncorporacion;
    protected double sueldo;

    public MiembroDelPersonal(String dni, String nombre, String apellido, String fechaNacimiento, String legajo, String fechaIncorporacion, double sueldo) {
        super(dni, nombre, apellido, fechaNacimiento);
        this.legajo = legajo;
        this.fechaIncorporacion = fechaIncorporacion;
        this.sueldo = sueldo;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "MiembroDelPersonal{" +
                "legajo='" + legajo + '\'' +
                ", fechaIncorporacion='" + fechaIncorporacion + '\'' +
                ", sueldo=" + sueldo +
                "} " + super.toString();
    }
}
