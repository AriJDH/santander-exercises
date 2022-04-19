package com.bootcamp.C6P2;

import java.util.List;

abstract public class Circuito {
    protected List<Persona> inscriptos;

    abstract public void inscribir(Persona persona);

    public void mostrar_inscriptos() {
        for (Persona inscripto: inscriptos) {
            System.out.println(inscripto);
        }
    }
}
