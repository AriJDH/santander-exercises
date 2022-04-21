package com.herencia.modelos;

public class Persona {

    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;
    protected String grupSang;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido, String fechaNacimiento, String grupSang) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.grupSang = grupSang;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGrupSang() {
        return grupSang;
    }

    public void setGrupSang(String grupSang) {
        this.grupSang = grupSang;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", grupSang='" + grupSang + '\'' +
                '}';
    }

    // lista direcciones
    // lista telefonos
    // lista direcciones laborales
    // lista telefonos laborales

    //protected double sueldo;
    //protected String rango;
    //protected int numLegajo;

    //protected int numeroVisita;

}
