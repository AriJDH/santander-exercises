package com.bootcamp.C6P2;

public class Carrera {
    private int id_actual;
    private final CircuitoChico circuitoChico;
    private final CircuitoMedio circuitoMedio;
    private final CircuitoAvanzado circuitoAvanzado;

    public Carrera(){
        id_actual = 1;
        circuitoChico = new CircuitoChico();
        circuitoMedio = new CircuitoMedio();
        circuitoAvanzado = new CircuitoAvanzado();
    }

    public void inscribir_persona_circuito_chico(Persona persona) {
        inscribir_persona_en(persona, circuitoChico);
    }

    public void inscribir_persona_circuito_medio(Persona persona) {
        inscribir_persona_en(persona, circuitoMedio);
    }

    public void inscribir_persona_circuito_avanzado(Persona persona) {
        inscribir_persona_en(persona, circuitoAvanzado);
    }

    private void inscribir_persona_en(Persona persona, Circuito circuito){
        id_actual = circuito.inscribir(id_actual, persona);
    }

    public void mostrar_inscriptos_circuito_chico() {
        circuitoChico.mostrar_inscriptos();
    }

    public void mostrar_inscriptos_circuito_medio() {
        circuitoMedio.mostrar_inscriptos();
    }

    public void mostrar_inscriptos_circuito_avanzado() {
        circuitoAvanzado.mostrar_inscriptos();
    }

    public void desinscribir_persona(Persona persona) {
        circuitoChico.desinscribir(persona);
        circuitoMedio.desinscribir(persona);
        circuitoAvanzado.desinscribir(persona);
    }

    public float obtener_ganancias_circuito_chico() {
        return circuitoChico.obtener_ganancias();
    }

    public float obtener_ganancias_circuito_medio() {
        return circuitoMedio.obtener_ganancias();
    }

    public float obtener_ganancias_circuito_avanzado() {
        return circuitoAvanzado.obtener_ganancias();
    }

    public float obtener_ganancias(){
        return circuitoChico.obtener_ganancias() + circuitoMedio.obtener_ganancias() + circuitoAvanzado.obtener_ganancias();
    }
}
