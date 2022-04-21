package com.herencia;

import com.herencia.modelos.Empleado;
import com.herencia.modelos.Persona;

public class App {
    public static void main(String[] args) {

        /*Persona persona = new Persona();
        Persona persona1 = persona;

        if (persona1.equals(persona)) {
            System.out.println("Son iguales.");
        }*/

        Empleado empleado = new Empleado("22", "Carlos,", "Gomez", "200000023", "RH", "0000-1", 90000);
        System.out.println(empleado);
    }
}
