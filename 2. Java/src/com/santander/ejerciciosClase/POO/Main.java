package com.santander.ejercicioPOO.ejerciciosClase.POO;

public class Main {
    public static void main(String[] args) {
        Persona personaVacia = new Persona();
        Persona personaBasica = new Persona("Carlos",30,"35957147");
        Persona personaFull = new Persona("Jose",35,"34741147",85.5f,1.75f);

        //Persona personaNull = new Persona("Adrian",23); //No funciona porque no existe un constructor que tome 2 var por entrada.

        System.out.println("Segun el indice de masa, la condicion de la persona es: "+personaFull.calcularMC());
        if(personaFull.calcularMC()==-1){
            System.out.println("-- Bajo peso --");
        }else if(personaFull.calcularMC()==0){
            System.out.println("-- Peso saludable --");
        }else{
            System.out.println("-- Sobrepeso --");
        }
        if(personaFull.esMayorEdad()==true){
            System.out.println("La persona es mayor de edad.");
        }else{
            System.out.println("La persona es menor de edad.");
        }

        System.out.println(personaFull.toString());


    }
}
