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
    public boolean inscribir(int id, Persona persona) {
        //TODO: podria verificar y devolver el id aumentado, esto me permitiria hacer el inscribir en CircuitoAvanzado aca y no en Carrera sin necesidad de devolver un booleano
        boolean valida = validar(persona);
        if(valida){
            persona.pagar(limite_edad, precio_menor_limite, precio_mayor_limite);
            super.corredores.put(id, persona);
        }
        return valida;
    }

    private boolean validar(Persona persona){
        return persona.puede_participar(edad_minima);
    }

}
