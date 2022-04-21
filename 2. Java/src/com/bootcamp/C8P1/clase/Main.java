package com.bootcamp.C8P1.clase;

import com.bootcamp.C8P1.clase.modelos.Empleado;
import com.bootcamp.C8P1.clase.modelos.Persona;

public class Main {
    public static void main(String[] args) {
        ejercicio_personas();
    }

    private static void ejercicio_personas() {
        Empleado empleado = new Empleado("38998262","juan","alvarez","23/02/1995","A",2000, 123);

        System.out.println(empleado);
    }
}
