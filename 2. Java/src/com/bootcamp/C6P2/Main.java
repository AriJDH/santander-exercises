package com.bootcamp.C6P2;

public class Main {
    public static void main(String[] args) {
        probar_circuito_chico();
        probar_circuito_medio();
        probar_circuito_avanzado();
        probar_todos();
        probar_no_repetir_inscripcion();
    }

    private static void probar_no_repetir_inscripcion() {
        Carrera carrera = new Carrera();
        Persona persona_1 = new Persona(388,"agus",20);

        //OK
        carrera.inscribir_persona_circuito_chico(persona_1);
        carrera.mostrar_inscriptos_circuito_chico();

        System.out.println("Los siguiente no se pueden inscribir");
        //Error
        carrera.inscribir_persona_circuito_chico(persona_1);
        carrera.inscribir_persona_circuito_medio(persona_1);
        carrera.inscribir_persona_circuito_avanzado(persona_1);

    }

    private static void probar_todos() {
        Carrera carrera = new Carrera();
        Persona persona_1 = new Persona(388,"agus",13);
        Persona persona_2 = new Persona(422,"brian",18);
        Persona persona_3 = new Persona(122,"juan",20);

        carrera.inscribir_persona_circuito_chico(persona_1);
        carrera.inscribir_persona_circuito_medio(persona_2);
        carrera.inscribir_persona_circuito_avanzado(persona_3);

        carrera.mostrar_inscriptos_circuito_chico();
        carrera.mostrar_inscriptos_circuito_medio();
        carrera.mostrar_inscriptos_circuito_avanzado();

        float total = carrera.obtener_ganancias();
        System.out.println("Ganancias total: " + total);
    }

    private static void probar_circuito_medio() {
        Carrera carrera = new Carrera();
        Persona persona_1 = new Persona(388,"agus",13);
        Persona persona_2 = new Persona(422,"brian",18);

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

    private static void probar_circuito_avanzado() {
        Carrera carrera = new Carrera();
        Persona persona_1 = new Persona(388,"agus",13);
        Persona persona_2 = new Persona(422,"brian",19);

        carrera.inscribir_persona_circuito_avanzado(persona_1);
        carrera.inscribir_persona_circuito_avanzado(persona_2);

        System.out.println("Circuito avanzado");
        carrera.mostrar_inscriptos_circuito_avanzado();

        carrera.desinscribir_persona(persona_1);

        System.out.println("Circuito avanzado despues de desinscribir");
        carrera.mostrar_inscriptos_circuito_avanzado();

        float ganancias = carrera.obtener_ganancias_circuito_avanzado();

        System.out.println("Ganancias avanzado: " + ganancias);


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
