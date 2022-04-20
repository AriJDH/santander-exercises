package com.Ejercicio1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ejercicio1 {
    public static void main(String[] args) throws FileNotFoundException {


        Persona persona1 = new Persona("Maria", 30, "32943204", 56.7, 1.65);
        Persona persona2 = new Persona("Mariana", 18, "3943204", 156.3, 1.55);
        Persona persona3 = new Persona("Mario", 17, "43943204", 46.3, 1.75);


        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona2.calcularIMC());
        System.out.println(persona3.calcularIMC());
        System.out.println(persona2.esMayorDeEdad());
        System.out.println(persona3.esMayorDeEdad());
        System.out.println(persona1.getNombre()+" " + persona1.mostrarDatos());
        System.out.println(persona3.getNombre()+" " + persona3.mostrarDatos());



    }
}
