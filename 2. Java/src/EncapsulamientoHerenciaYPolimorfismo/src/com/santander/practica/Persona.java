package com.santander.practica;

public class Persona {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String fechaNac;
    protected String grupoSanguíneo;
    //protected List<Telefono> telefonos;


    public Persona(String dni, String nombre, String apellido, String fechaNac, String grupoSanguíneo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.grupoSanguíneo = grupoSanguíneo;
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

    public String getGrupoSanguíneo() {
        return grupoSanguíneo;
    }

    public void setGrupoSanguíneo(String grupoSanguíneo) {
        this.grupoSanguíneo = grupoSanguíneo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", grupoSanguíneo='" + grupoSanguíneo + '\'' +
                '}';
    }
}
