package com.santander.bootcamp.modelos;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;

    public Persona( ) {
    }

    public int calcularIMC(){
        double IMC = peso/(altura*altura);

        if (IMC < 20){
            System.out.println("El usuario tiene bajo peso.");
            return -1;

        } else if (IMC > 25){
            System.out.println("El usuario tiene un peso saludable.");
            return 1;
        }

        System.out.println("El usuario tiene sobrepeso");
        return 0;
    }

    public boolean esMayorDeEdad(){

        if(edad>=18){
            System.out.println("El usuario es mayor de edad.");
            return true;
        }

        System.out.println("El usuario es menor de edad.");
        return false;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
}
