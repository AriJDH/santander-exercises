package com.pruebas.prueba1.clases;

public class Persona {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String fechaDeNacimiento;
    protected String grupoSanguineo;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido, String fechaDeNacimiento, String grupoSanguineo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                '}';
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

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
}
