package com.pruebas.prueba1.clases;

public class Visitante extends Persona{
    protected int numeroDeVisita;

    public Visitante(String dni, String nombre, String apellido, String fechaDeNacimiento, String grupoSanguineo, int numeroDeVisita) {
        super(dni, nombre, apellido, fechaDeNacimiento, grupoSanguineo);
        this.numeroDeVisita = numeroDeVisita;
    }

    public int getNumeroDeVisita() {
        return numeroDeVisita;
    }

    public void setNumeroDeVisita(int numeroDeVisita) {
        this.numeroDeVisita = numeroDeVisita;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", numeroDeVisita=" + numeroDeVisita +
                '}';
    }

}
