package com.santander.dh;

public class Persona {
    String nombre, dni;
    Integer edad;
    Double peso, altura;

    public Persona(String nombre, String dni, Integer edad, Double peso, Double altura) {
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

    public Integer calcularMC(){
        Double calculoTotal;
        calculoTotal = peso/(altura*2);

        if(calculoTotal < 20){
            return -1;
        } else if (calculoTotal >= 20 && calculoTotal <= 25){
            return 0;
        } else{
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        if (this.edad >=18){
            return true;
        } else return false;
    }

    public String toString(){
        return nombre + " " + edad + " " + dni + " " + altura + "m " + peso + "kg";
    }
}