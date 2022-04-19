package com.bootcamp.C6P2;

import java.util.HashMap;

public class CircuitoMedio extends Circuito {
    private final String descripcion = "2 km por selva y arroyos.";
    private final int LIMITE_EDAD = 18;
    private final float PRECIO_MENOR_LIMITE = 2000;
    private final float PRECIO_MAYOR_LIMITE = 2300;

    public CircuitoMedio(){
        super.corredores = new HashMap<>();
    }

    @Override
    public boolean inscribir(int id, Persona persona) {
        persona.pagar(LIMITE_EDAD, PRECIO_MENOR_LIMITE, PRECIO_MAYOR_LIMITE);
        super.corredores.put(id, persona);
        return true;
    }
}
