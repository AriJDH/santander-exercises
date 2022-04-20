package com.resolucion.clases;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
    public int calcularIMC(){
        double imc=peso/Math.pow(2,altura);
        if(imc<20){
            return -1;
        }
        else if(imc>=20 && imc<=25){
            return 0;
        }
        else{
            return 1;
        }
    }

    public  boolean mayorEdad(){
        if(edad<18){
            return false;
        }
        else{
            return true;
        }
    }
    public String mostrarInformacion(){
        return
                "Nombre: " + nombre +
                        ", Edad= " + edad +
                        ", Dni= " + dni +
                        ", Peso= " + peso +
                        ", Altura= " + altura;
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
