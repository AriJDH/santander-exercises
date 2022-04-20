package com.bootcamp.C7P1.modelos;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;
    private static final int LIMITE_MAYOR_EDAD = 18;

    public Persona(){

    }

    public Persona(String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni,
                   float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        
    }

    public int calcularIMC() {
        double imc = peso / (Math.pow(altura, 2));
        System.out.println("IMC: " + imc);
        int valor = -1;
        if (imc >= 20 && imc <= 25){
            valor = 0;
        } else if (imc > 25) {
            valor = 1;
        }
        return valor;
    }

    public boolean esMayorDeEdad() {
        return edad >= LIMITE_MAYOR_EDAD;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre:" + nombre +
                ", edad: " + edad +
                ", dni: " + dni +
                ", peso: " + peso +
                ", altura: " + altura + "}";
    }
}
