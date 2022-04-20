package com.resolucion2.clases;

public class Participante {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int celular;
    private int numeroEmergencia;
    private String grupoSanguineo;
    private int numeroParticipante;
    private int categoria;

    public Participante(int dni, String nombre, String apellido, int edad, int celular, int numeroEmergencia, String grupoSanguineo, int numeroParticipante, int categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.numeroParticipante = numeroParticipante;
        this.categoria = categoria;
    }

    public int getNumeroParticipante() {
        return numeroParticipante;
    }

    public int getNroInscripto() {
        return categoria;
    }

    public int getEdad() {
        return edad;
    }


    @Override
    public String toString() {
        return "Participante{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", celular=" + celular +
                ", numeroEmergencia=" + numeroEmergencia +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", numeroParticipante=" + numeroParticipante +
                ", categoria=" + categoria +
                '\n';
    }
}
