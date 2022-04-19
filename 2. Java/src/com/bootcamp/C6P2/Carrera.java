package com.bootcamp.C6P2;

public class Carrera {
    private int id_actual;
    private CircuitoChico circuitoChico;
    private CircuitoMedio circuitoMedio;
    private CircuitoAvanzado circuitoAvanzado;

    public Carrera(){
        id_actual = 1;
        circuitoChico = new CircuitoChico();
        circuitoMedio = new CircuitoMedio();
        circuitoAvanzado = new CircuitoAvanzado();
    }

    private boolean esta_inscripto(Persona persona){
        return circuitoChico.esta_inscripto(persona);
    }
    //TODO: validar que no este inscripto circutioCHico.no_esta && circuitoMedio.no_esta
    public void inscribir_persona_circuito_chico(Persona persona) {
        if(!esta_inscripto(persona)){
            circuitoChico.inscribir(id_actual, persona);
            persona.set_numero(id_actual);
            id_actual++;
        } else {
            System.out.println("Participante ya esta inscripto");
        }
    }

    public void inscribir_persona_circuito_medio(Persona persona) {
        if(!esta_inscripto(persona)){
            circuitoMedio.inscribir(id_actual, persona);
            persona.set_numero(id_actual);
            id_actual++;
        } else {
            System.out.println("Participante ya esta inscripto");
        }
    }

    public void inscribir_persona_circuito_avanzado(Persona persona) {
        if(!esta_inscripto(persona)){
            if(circuitoAvanzado.inscribir(id_actual, persona)){
                persona.set_numero(id_actual);
                id_actual++;
            } else {
                System.out.println("Persona menor de edad no puede participar del circuito avanzado");
            }
        } else {
            System.out.println("Participante ya esta inscripto");
        }
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
