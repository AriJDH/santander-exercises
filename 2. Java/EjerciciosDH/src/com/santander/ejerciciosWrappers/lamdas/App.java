package com.santander.ejerciciosWrappers.lamdas;



import com.santander.ejerciciosWrappers.Persona;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        /*IScoring scoring;
        scoring = (a,b) -> a + b;

        System.out.println(scoring.calcular(12,15));

        IScoring scoring2;
        scoring2 = (a,b) -> a + b * 2;

        System.out.println(scoring2.calcular(12,15));


    }*/
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona("Jorge", "Gomez"));

        personas.forEach(persona -> {
            System.out.println(persona);
        });

        System.out.println(personas.stream().filter((persona) -> persona.getNombre().equals("Jorge")).findFirst());

        //List<Persona> pers1 = personas.stream().filter((persona) -> persona.getNombre().equals("Jorge")).collect(Collectors.toList());
    }
}
