package com.pruebas.prueba1.main;

import com.pruebas.prueba1.clases.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona1 = persona;

        if(persona.equals(persona1)){
            System.out.println("Son iguales");
        }

        System.out.println(persona.toString());
        System.out.println(persona.getClass().getName());

        Persona person2= new Empleado("14331","afdadfad","fafxz","30/21/12","A+",23213,"No tiene",312321);
        person2.toString();

        Persona personaJefe= new Encargado("14331","afdadfad","fafxz","30/21/12","A+",23213,"No tiene",312321,new ArrayList<>());
        System.out.println(personaJefe);

        //No puede usar metodo empleado
        Object persona32= new Empleado("14331","afdadfad","fafxz","30/21/12","A+",23213,"No tiene",312321);
        System.out.println(persona32);

        //Polimorfismo estatico y ad hoc
        //

    }
}
