package com.santander.practica.dos;

import com.santander.practica.Persona;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ScoringInterfaz scoring;
        scoring = (a,b) -> a+b+10;
        System.out.println(scoring.calcular(12,13));

        ArrayList<Persona> persona = new ArrayList<>();
        persona.add(new Persona("Juan", "Gomez"));
        persona.add(new Persona("Fabri", "Lopez"));
        persona.add(new Persona("Juan", "Lopez"));

        persona.forEach(p -> {
            System.out.println(persona);
        });
        System.out.println(persona.stream().filter((per)-> per.getNombre().equals("Fabri")).findFirst());
        System.out.println(persona.stream().filter((per)-> per.getNombre().equals("Juan")).findAny());
        System.out.println(persona.stream().filter((per)-> per.getNombre().equals("Juan")).collect(Collectors.toList()));
        persona.forEach(System.out::println);
    }
}
