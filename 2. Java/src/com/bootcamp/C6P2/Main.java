package com.bootcamp.C6P2;

public class Main {
    public static void main(String[] args) {
        probar_circuito_chico();
        probar_circuito_medio();
    }

    private static void probar_circuito_medio() {
        Carrera carrera = new Carrera();
        Persona persona_1 = new Persona(388,"agus",26);
        Persona persona_2 = new Persona(422,"brian",27);

        carrera.inscribir_persona_circuito_medio(persona_1);
        carrera.inscribir_persona_circuito_medio(persona_2);

        System.out.println("Circuito medio");
        carrera.mostrar_inscriptos_circuito_medio();

        carrera.desinscribir_persona(persona_1);

        System.out.println("Circuito medio despues de desinscribir");
        carrera.mostrar_inscriptos_circuito_medio();

        float ganancias_chico = carrera.obtener_ganancias_circuito_medio();

        System.out.println("Ganancias medio: " + ganancias_chico);


    }

    private static void probar_circuito_chico() {
        Carrera carrera = new Carrera();
        Persona persona_en_chico_1 = new Persona(388,"agus",26);
        Persona persona_en_chico_2 = new Persona(422,"brian",27);

        carrera.inscribir_persona_circuito_chico(persona_en_chico_1);
        carrera.inscribir_persona_circuito_chico(persona_en_chico_2);

        System.out.println("Circuito chico");
        carrera.mostrar_inscriptos_circuito_chico();

        carrera.desinscribir_persona(persona_en_chico_2);

        System.out.println("Circuito chico");
        carrera.mostrar_inscriptos_circuito_chico();

        float ganancias_chico = carrera.obtener_ganancias_circuito_chico();

        System.out.println("Ganancias chico: " + ganancias_chico);

    }
}
