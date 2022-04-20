package com.santander.ejercicioIntegradorCollections;

import java.util.Objects;

public class Participante {
    //Atributos de Clase:
    public static int id =1;
    int idParticipante;
    int categoria;
    String dni;
    String apellido;
    int edad;
    String nCelular;
    String nEmergencias;
    String gSanguineo;

    float aporte;


    public Participante(int categoria,String dni, String apellido, int edad, String nCelular, String nEmergencias, String gSanguineo, float aporte) {
        this.idParticipante = Participante.id++;
        this.categoria = categoria;
        this.dni = dni;
        this.apellido = apellido;
        this.edad = edad;
        this.nCelular = nCelular;
        this.nEmergencias = nEmergencias;
        this.gSanguineo = gSanguineo;
        this.aporte = aporte;
    }
    public void mostrarID(){
        System.out.println("Id participante= "+ idParticipante);
    }

    public int getIdParticipante() {
        return idParticipante;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getnCelular() {
        return nCelular;
    }

    public void setnCelular(String nCelular) {
        this.nCelular = nCelular;
    }

    public String getnEmergencias() {
        return nEmergencias;
    }

    public void setnEmergencias(String nEmergencias) {
        this.nEmergencias = nEmergencias;
    }

    public String getgSanguineo() {
        return gSanguineo;
    }

    public void setgSanguineo(String gSanguineo) {
        this.gSanguineo = gSanguineo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public float getAporte() {
        return aporte;
    }

    public void setAporte(float aporte) {
        this.aporte = aporte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return dni.equals(that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
