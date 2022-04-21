package com.santander.dh;

public class Persona {
    String nombre, dni;
    Integer edad, peso, altura;

    public Persona(String nombre, String dni, Integer edad, Integer peso, Integer altura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, String dni, Integer edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona() {
    }

}