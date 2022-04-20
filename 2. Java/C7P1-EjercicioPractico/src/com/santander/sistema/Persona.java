package com.santander.sistema;
import java.lang.Math;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;

    //Primer contructor
    public Persona() {
    }
    //Segundo constructor
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    //Tercer contructor
    public Persona(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    //GETTERS
    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}
    public String getDni() {return dni;}
    public double getPeso() {return peso;}
    public double getAltura() {return altura;}

    @Override
    public String toString(){
        return "PERSONA | "
                         + this.getNombre() +" , " + this.getEdad() + " , "
                         + this.getDni() +" , " + this.getPeso() +" , " +this.getAltura();
    }

    public int calcularIMC() {
        double resultado = this.peso / ( Math.pow(this.altura,2) );
        if (resultado < 20) {
            return -1;
        }
        else{
            if (resultado <= 25) {
                return 0;
            }
            else{
                return 1;
            }
        }
    }

    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        }
        else{
            return false;
        }
    }
}
