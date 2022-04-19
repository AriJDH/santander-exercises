package com.bootcamp.C6P2;

import java.util.HashMap;

public class CircuitoAvanzado extends Circuito {
    private final int LIMITE_EDAD = 18;
    private final float PRECIO_MAYOR_LIMITE = 2800;
    private final int EDAD_MINIMA = 18;

    public CircuitoAvanzado(){
        super.corredores = new HashMap<>();
    }

    @Override
    public boolean inscribir(int id, Persona persona) {
        //TODO: podria verificar y devolver el id aumentado, esto me permitiria hacer el inscribir en CircuitoAvanzado aca y no en Carrera sin necesidad de devolver un booleano
        boolean valida = validar(persona);
        if(valida){
            persona.pagar(LIMITE_EDAD, 0, PRECIO_MAYOR_LIMITE);
            super.corredores.put(id, persona);
        }
        return valida;
    }

    private boolean validar(Persona persona){
        return persona.puede_participar(EDAD_MINIMA);
    }

}
