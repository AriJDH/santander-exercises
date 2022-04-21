package com.santander.practica;

public class Visitante extends Persona {
    protected int nroVisitante;

    public Visitante(String dni, String nombre, String apellido, String fechaNac, String grupoSanguíneo, int nroVisitante) {
        super(dni, nombre, apellido, fechaNac, grupoSanguíneo);
        this.nroVisitante = nroVisitante;
    }

    public int getNroVisitante() {
        return nroVisitante;
    }

    public void setNroVisitante(int nroVisitante) {
        this.nroVisitante = nroVisitante;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", grupoSanguíneo='" + grupoSanguíneo + '\'' +
                ", nroVisitante=" + nroVisitante +
                '}';
    }
}
