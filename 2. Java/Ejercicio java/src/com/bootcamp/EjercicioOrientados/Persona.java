package com.bootcamp.EjercicioOrientados;

public class Persona {
    String nombre, dni;
    int edad;
    float peso, altura;

    public Persona() {
    }

    public Persona(String nombre, int edad,String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String dni, float peso, float altura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }


    public int calcularIMC(){
        float IMC = (float) (peso/(Math.pow(altura,2)));
        if (IMC<20){
            return -1;
        }else if(IMC < 25 ){
            return 0;
        }
        return 1;


    }

    public boolean esMayorDeEdad(){
        return edad >=18;
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
