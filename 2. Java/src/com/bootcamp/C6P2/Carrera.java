package com.bootcamp.C6P2;

public class Carrera {
    private int numero_actual;
    private Circuito circuitoChico;

    public Carrera(){
        numero_actual = 1;
        circuitoChico = new CircuitoChico();
        //circuitoChico = new CircuitoMedio();
        //circuitoChico = new CircuitoGrande();
    }


    public void inscribir_persona_circuito_chico(Persona persona) {
        persona.set_numero(numero_actual);
        circuitoChico.inscribir(persona);
        numero_actual++;
    }

    public void mostrar_inscriptos_circuito_chico() {
        circuitoChico.mostrar_inscriptos();
    }
}
