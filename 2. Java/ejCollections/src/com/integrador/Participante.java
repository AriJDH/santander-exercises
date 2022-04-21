package com.integrador;

import java.util.Objects;

public class Participante {
    private String nombre, dni, celular, numEmergia, grupoS;
    private int edad, nroInscripto, monto;

    public Participante(String nombre, String dni, String celular, String numEmergia, String grupoS, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
        this.numEmergia = numEmergia;
        this.grupoS = grupoS;
        this.edad = edad;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumEmergia() {
        return numEmergia;
    }

    public void setNumEmergia(String numEmergia) {
        this.numEmergia = numEmergia;
    }

    public String getGrupoS() {
        return grupoS;
    }

    public void setGrupoS(String grupoS) {
        this.grupoS = grupoS;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNroInscripto() {
        return nroInscripto;
    }

    public void setNroInscripto(int nroInscripto) {
        this.nroInscripto = nroInscripto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return nroInscripto == that.nroInscripto && Objects.equals(dni, that.dni);
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", nroInscripto=" + nroInscripto +
                '}';
    }
}



