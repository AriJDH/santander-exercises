package com.bootcamp.C7P1;

import com.bootcamp.C7P1.modelos.Persona;

public class Main {
    public static void main(String[] args) {
        Persona personaCompleta = new Persona("Agus",18,"38998262",78,1.84f);
        Persona personaMedio = new Persona("Agus",18,"38998262");
        Persona personaVacia = new Persona();

        //Error
        //Persona persona_vacia = new Persona("agus", "18");

        int valor = personaCompleta.calcularIMC();
        System.out.println("Valor IMC: " + valor);

        boolean es_mayor = personaCompleta.esMayorDeEdad();
        System.out.println("Es mayor?: " + es_mayor);

        System.out.println(personaCompleta);

    }
}
