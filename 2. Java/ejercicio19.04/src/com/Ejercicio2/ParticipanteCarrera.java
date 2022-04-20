package com.Ejercicio2;

public class ParticipanteCarrera {

    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int celular;
    private int telefonoEmergencia;
    private String grupoSanguineo;

    public ParticipanteCarrera(int dni, String nombre, String apellido, int edad,
                               int celular, int telefonoEmergencia, String grupoSanguineo){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.telefonoEmergencia = telefonoEmergencia;
        this.grupoSanguineo = grupoSanguineo;
    }

    public int getCelular() {
        return celular;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public int getTelefonoEmergencia() {
        return telefonoEmergencia;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public void setTelefonoEmergencia(int telefonoEmergencia) {
        this.telefonoEmergencia = telefonoEmergencia;
    }

    @Override
    public String toString() {
        return "ParticipanteCarrera{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", celular=" + celular +
                ", telefonoEmergencia=" + telefonoEmergencia +
                ", grupoSanguineo=" + grupoSanguineo +
                '}';
    }
}
