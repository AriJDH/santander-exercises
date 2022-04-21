package com.auxiliarHerencia;

import com.auxiliarHerencia.modelos.Persona;

public class ap {
    public static void main(String[] args) {

        Persona persona = new Persona ();

        Persona persona1 = persona;

        if (persona.equals(persona1)) {
            System.out.println("Son iguales.");
        }

    }
}
