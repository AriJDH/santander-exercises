package com.empresa.modelos;

public class Persona {

    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String fechaNac;
    protected String grupoSang;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido, String fechaNac, String grupoSang) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.grupoSang = grupoSang;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getGrupoSang() {
        return grupoSang;
    }

    public void setGrupoSang(String grupoSang) {
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

    // lista direcciones
    // lista telefonos
    // lista direcciones laborales
    // lista telefonos laborales


    //protected int numeroVisita;

    //protected int numeroLegajo;




}
