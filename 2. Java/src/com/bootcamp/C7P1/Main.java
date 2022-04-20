package com.bootcamp.C7P1;

import com.bootcamp.C7P1.modelos.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona_completa = new Persona("Agus",18,"38998262",78,1.84f);
        Persona persona_medio = new Persona("Agus",18,"38998262");
        Persona persona_vacia = new Persona();

        //Error
        //Persona persona_vacia = new Persona("agus", "18");

        //int valor = persona_completa.calcularIMC();
        //System.out.println("Valor IMC: " + valor);
    }
}
