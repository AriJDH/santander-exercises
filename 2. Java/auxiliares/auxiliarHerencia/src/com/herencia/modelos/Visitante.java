package com.herencia.modelos;

public class Visitante extends Persona {

    protected int numVisitante;

    public Visitante() {
    }

    public Visitante(String dni, String nombre, String apellido, String fechaNacimiento, String grupSang, int numVisitante) {
        super(dni, nombre, apellido, fechaNacimiento, grupSang);
        this.numVisitante = numVisitante;
    }

    public int getNumVisitante() {
        return numVisitante;
    }

    public void setNumVisitante(int numVisitante) {
        this.numVisitante = numVisitante;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", grupSang='" + grupSang + '\'' +
                ", numVisitante=" + numVisitante +
                '}';
    }
}
