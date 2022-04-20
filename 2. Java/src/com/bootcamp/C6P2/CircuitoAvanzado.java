package com.bootcamp.C6P2;

import java.util.HashMap;

public class CircuitoAvanzado extends Circuito {

    public CircuitoAvanzado(){
        super.limite_edad = 18;
        super.precio_menor_limite = 0;
        super.precio_mayor_limite = 2800;
        super.edad_minima = 18;
        super.corredores = new HashMap<>();
    }

    @Override
    public int inscribir(int id, Persona persona) {
        int sig_id = id;
        if(validar(persona)){
            if(!esta_inscripto(persona)){
                persona.pagar(limite_edad, precio_menor_limite, precio_mayor_limite);
                super.corredores.put(id, persona);
                persona.set_numero(id);
                sig_id++;
            } else {
                System.out.println("Participante ya esta inscripto en Circuito Avanzado");
            }
        } else {
            System.out.println("Menores de edad no se pueden inscribir en Circuito Avanzado");
        }
        return sig_id;
    }

    private boolean validar(Persona persona){
        return persona.puede_participar(edad_minima);
    }

}
