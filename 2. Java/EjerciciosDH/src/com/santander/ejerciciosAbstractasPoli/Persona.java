package com.santander.ejerciciosAbstractasPoli;

public abstract class Persona {
    private String dni;
    private String nombre;

    public void saludar() {
        System.out.println("Soy un humano y te saludo: Hola!!!");
    }

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
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
}
