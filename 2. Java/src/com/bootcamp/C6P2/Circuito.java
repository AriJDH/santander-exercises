package com.bootcamp.C6P2;

import java.util.HashMap;
import java.util.Map;

abstract public class Circuito {
    protected HashMap<Integer, Persona> corredores;
    protected int limite_edad;
    protected float precio_menor_limite;
    protected float precio_mayor_limite;
    protected int edad_minima = 0;

    abstract public int inscribir(int id, Persona persona);

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

    public boolean esta_inscripto(Persona persona) {
        return corredores.containsKey(persona.get_id());
    }
}
