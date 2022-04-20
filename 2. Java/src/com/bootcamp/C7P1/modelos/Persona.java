package com.bootcamp.C7P1.modelos;

public class Persona {
    private final String nombre;
    private final int edad;
    private final String dni;
    private final float peso;
    private final float altura;

    public Persona(String nombre, int edad, String dni,
                   float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        
    }
}
