package com.santander.modelos;

public class Persona {
    private String nombre;
    private String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    //GETTERS
    public String getNombre() {return nombre;}
    public String getDni() {return dni;}
    //SETTERS
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDni(String dni) {this.dni = dni;}
}
