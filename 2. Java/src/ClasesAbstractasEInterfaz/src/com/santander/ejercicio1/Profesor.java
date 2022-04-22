package com.santander.ejercicio1;

import java.util.List;

public class Profesor extends Empleado implements Pedagogo {
    int nroMatricula;
    boolean dandoClases;

    public Profesor(int dni, String nombre, String apellido, int edad, int nroEmplado, String area, int nroMatricula) {
        super(dni, nombre, apellido, edad, nroEmplado, area);
        this.nroMatricula = nroMatricula;
        this.dandoClases = false;
    }

    public int getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(int nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nroEmplado=" + nroEmplado +
                ", area='" + area + '\'' +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", nroMatricula=" + nroMatricula +
                '}';
    }

    @Override
    public void trabajar() {
        dandoClases = true;
    }

    public void dejarDeTrabajar() {
        dandoClases = false;
    }

    @Override
    public void enseñar(String tema, List<Persona> personas) {
        System.out.println(nombre + " " + apellido + " está enseñando " + tema + " a " + personas);
    }
}
