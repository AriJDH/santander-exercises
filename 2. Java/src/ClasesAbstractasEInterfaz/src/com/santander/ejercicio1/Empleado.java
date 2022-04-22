package com.santander.ejercicio1;

public abstract class Empleado extends Persona {
    int nroEmplado;
    String area;

    public Empleado(int dni, String nombre, String apellido, int edad, int nroEmplado, String area) {
        super(dni, nombre, apellido, edad);
        this.nroEmplado = nroEmplado;
        this.area = area;
    }

    public int getNroEmplado() {
        return nroEmplado;
    }

    public void setNroEmplado(int nroEmplado) {
        this.nroEmplado = nroEmplado;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nroEmplado=" + nroEmplado +
                ", area='" + area + '\'' +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    public abstract void trabajar();
}
