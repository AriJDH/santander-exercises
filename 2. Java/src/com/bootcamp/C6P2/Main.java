package com.bootcamp.C6P2;

public class Main {
    public static void main(String[] args) {

        Carrera carrera = new Carrera();
        Persona persona_en_chico_1 = new Persona(388,"agus",26);
        Persona persona_en_chico_2 = new Persona(422,"brian",27);

        carrera.inscribir_persona_circuito_chico(persona_en_chico_1);
        carrera.inscribir_persona_circuito_chico(persona_en_chico_2);

        System.out.println("Circuito chico");
        carrera.mostrar_inscriptos_circuito_chico();
    }
}
