package com.santanderbootcamp.C7P1.modelos;

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

    public int calcularIMC() {
        double calculo = peso/(altura*altura);
        if (peso < 20.0) {
            return -1;
        }
        if (peso > 25.0) {
            return 1;
        }
        return 0;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String toString() {
        return nombre + " con DNI " + dni + ", tiene " +edad + " años su peso es " + peso + "kg y altura " + altura + "mts";
    }
}
