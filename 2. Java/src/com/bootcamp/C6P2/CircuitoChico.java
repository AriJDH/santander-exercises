package com.bootcamp.C6P2;

import java.util.HashMap;

public class CircuitoChico extends Circuito {

    public CircuitoChico(){
        super.limite_edad = 18;
        super.precio_menor_limite = 1300;
        super.precio_mayor_limite = 1500;
        super.corredores = new HashMap<>();
    }

    @Override
    public int inscribir(int id, Persona persona) {
        int sig_id = id;
        if(!esta_inscripto(persona)){
            //TODO: guardar el numero y lo que abona en una clase que wrapea a Persona i.e. Inscripcion(Persona, numero, abono)
            persona.pagar(limite_edad, precio_menor_limite, precio_mayor_limite);
            super.corredores.put(id, persona);
            persona.set_numero(id);
            sig_id++;
        } else {
            System.out.println("Participante ya esta inscripto en Circuito Chico");
        }
        return sig_id;
    }

}
