package com.bootcamp.C8P1.clase.modelos;

public class Persona {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String fechaNac;
    protected String grupoSang;

    public Persona(String dni, String nombre, String apellido, String fechaNac, String grupoSang) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.grupoSang = grupoSang;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", grupoSang='" + grupoSang + '\'' +
                '}';
    }
}
