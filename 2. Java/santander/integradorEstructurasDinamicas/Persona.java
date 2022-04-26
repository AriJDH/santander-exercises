package com.santander.practicaListas.integradorEstructurasDinamicas;

public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String celular;
    private String numeroEmergencia;
    private String grupoSanguineo;
    private int numeroParticipante;

    public Persona(String dni, String nombre, String apellido, int edad, String celular, String numeroEmergencia, String grupoSanguineo) {
        this.setDni(dni);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setCelular(celular);
        this.setNumeroEmergencia(numeroEmergencia);
        this.setGrupoSanguineo(grupoSanguineo);

    }

    public String getDni() {
        return dni;
    }

    private void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    private void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    private void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    private void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public boolean esMayor(){
        return this.edad>=18;
    }
    public int getNumeroParticipante() {
        return numeroParticipante;
    }

    public void setNumeroParticipante(int numeroParticipante) {
        this.numeroParticipante = numeroParticipante;
    }

    @Override
    public String toString() {
        return
                "dni='" + dni + '\'' +
                        ", nombre='" + nombre + '\'' +
                        ", apellido='" + apellido + '\'' +
                        ", edad=" + edad +
                        ", celular='" + celular + '\'' +
                        ", numeroEmergencia='" + numeroEmergencia + '\'' +
                        ", grupoSanguineo='" + grupoSanguineo + '\'' +
                        ", numeroParticipante=" + numeroParticipante;
    }
}
