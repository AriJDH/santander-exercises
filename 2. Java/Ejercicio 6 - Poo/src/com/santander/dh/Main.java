package com.santander.dh;

public class Main {
    public static void main(String[] args) {
        Persona personaVacio = new Persona();
        Persona personaAlgunosParametros = new Persona("Alexis", "39628561", 25);
        Persona personaTodosParametros = new Persona("Alexis", "39628561", 25, 70.0, 168.0);

        Integer IMC = personaTodosParametros.calcularMC();
        boolean esMayorDeEdad = personaTodosParametros.esMayorDeEdad();

        System.out.println(personaTodosParametros.toString(esMayorDeEdad, IMC));

    }
}
