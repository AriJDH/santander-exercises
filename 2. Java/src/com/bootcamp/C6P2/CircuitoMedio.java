package com.bootcamp.C6P2;

import java.util.HashMap;

public class CircuitoMedio extends Circuito {

    public CircuitoMedio(){
        super.limite_edad = 18;
        super.precio_menor_limite = 2000;
        super.precio_mayor_limite = 2300;
        super.corredores = new HashMap<>();
    }

    @Override
    public int inscribir(int id, Persona persona) {
        int sig_id = id;
        if(!esta_inscripto(persona)){
            persona.pagar(limite_edad, precio_menor_limite, precio_mayor_limite);
            super.corredores.put(id, persona);
            persona.set_numero(id);
            sig_id++;
        } else {
            System.out.println("Participante ya esta inscripto en Circuito Medio");
        }
        return sig_id;
    }
}
