package com.santanderbootcamp.POO.modelos;

public class Persona {
    private String dni;
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    
    public Persona() {}

    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni, String nombre, int edad, double peso, double altura) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
}
