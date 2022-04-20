package com.santander.ejercicioPOO.ejerciciosClase.POO;

public class Persona {
    String nombre;
    int edad;
    String dni;
    float peso;
    float altura;

    public Persona(){

    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public float calcularMC(){
        double mc= peso/(Math.pow(2,altura));
        if(mc<20){
            return -1;
        }else if(mc>=20&&mc<=25){
            return 0;
        }else{
            return 1;
        }
    }
    public boolean esMayorEdad(){
        if(edad>=18){
            return true;
        } else{
            return false;
        }
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
}
