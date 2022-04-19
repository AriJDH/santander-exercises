package com.bootcamp.C6P2;

import java.util.HashMap;
import java.util.Map;

abstract public class Circuito {
    protected HashMap<Integer, Persona> corredores;

    abstract public void inscribir(int id, Persona persona);

    public void mostrar_inscriptos() {
        for(Map.Entry<Integer, Persona> entrada : corredores.entrySet()){
            Persona corredor = entrada.getValue();
            System.out.println(corredor);
        }
    }

    public void desinscribir(Persona persona) {
        corredores.remove(persona.get_id());
    }

    // muestra la ganancia de todos los participiantes actualmente inscriptos
    public float obtener_ganancias() {
        float total = 0;
        for(Map.Entry<Integer, Persona> entrada : corredores.entrySet()){
            Persona corredor = entrada.getValue();
            total += corredor.get_abono();
        }
        return total;
    }
}
