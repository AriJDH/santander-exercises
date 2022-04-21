package com.santander.dh;

public class Main {
    public static void main(String[] args) {
        Persona personaVacio = new Persona();
        Persona personaAlgunosParametros = new Persona("Alexis", "39628561", 25);
        Persona personaTodosParametros = new Persona("Alexis", "39628561", 25, 70.0, 168.0);

        System.out.println(personaTodosParametros.toString());
        boolean esMayorDeEdad = personaTodosParametros.esMayorDeEdad();
        if(esMayorDeEdad == true){
            System.out.println("Es mayor de edad");
        } else{
            System.out.println("Es menor de edad");
        }
        personaTodosParametros.calcularMC();
    }
}
