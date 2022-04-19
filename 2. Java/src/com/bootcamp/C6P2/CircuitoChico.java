package com.bootcamp.C6P2;

import java.util.HashMap;

public class CircuitoChico extends Circuito {
    private final int LIMITE_EDAD = 18;
    private final float PRECIO_MENOR_LIMITE = 1300;
    private final float PRECIO_MAYOR_LIMITE = 1500;
    private final int edad_minima = 0;

    public CircuitoChico(){
        super.corredores = new HashMap<>();
    }

    @Override
    public boolean inscribir(int id, Persona persona) {
        //TODO: guardar el numero y lo que abona en una clase que wrapea a Persona i.e. Inscripcion(Persona, numero, abono)
        persona.pagar(LIMITE_EDAD, PRECIO_MENOR_LIMITE, PRECIO_MAYOR_LIMITE);
        super.corredores.put(id, persona);
        return true;
    }

}
