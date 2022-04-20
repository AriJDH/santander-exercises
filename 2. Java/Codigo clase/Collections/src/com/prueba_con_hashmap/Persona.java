package com.prueba_con_hashmap;

public class Persona {
    int dni;

    public Persona(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                '}';
    }
}
