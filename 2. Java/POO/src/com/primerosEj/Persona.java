package com.primerosEj;

public class Persona {
    private String nombre, dni;
    private int edad;
    private double peso, altura;

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String dni, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {

    }

    public int calcularIMC() {
        if ((peso / (altura * altura)) < 20) {
            return -1;
        } else {
            if ((peso / (altura * altura)) <= 25) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public boolean esMayor(){
        return this.edad >= 18;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
