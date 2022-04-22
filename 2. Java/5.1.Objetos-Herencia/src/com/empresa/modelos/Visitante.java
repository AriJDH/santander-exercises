package com.empresa.modelos;

public class Visitante extends Persona {

    protected int numeroVisita;

    public Visitante(String dni, String nombre, String apellido, String fechaNac, String grupoSang, int numeroVisita) {
        super(dni, nombre, apellido, fechaNac, grupoSang);
        this.numeroVisita = numeroVisita;
    }



}
