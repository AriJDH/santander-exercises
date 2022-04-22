package com.Wrapper;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        /*
        DesdeHasta<Integer, Integer> desdeHastaNumero = new DesdeHasta<Integer, Integer>();
        desdeHastaNumero.setDesde(12);
        desdeHastaNumero.setHasta(14);

        DesdeHasta<String, String> desdeHastaNombre = new DesdeHasta<>();
        desdeHastaNombre.setDesde(1);
        desdeHastaNombre.setDesde(2);
        System.out.println(desdeHastaNombre);

         */

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("juan","Gomez"));
        personas.add(new Persona("juan","Gomez"));
        //comparamos for each vs api Stream
        personas.forEach(persona -> {
            System.out.println(persona);
        });

        personas.stream().filter((persona)->
                persona.getNombre().equals("juan")).findFirst();

        personas.stream().filter((persona)->
                persona.getNombre().equals("juan")).collect(Collectors.toList());




        IScoring scoring;
        scoring = (a,b) -> a + b;

        System.out.println(scoring.calcular(10,15));

        IScoring scoring1;
        scoring1 = (a,b) -> a + b;

        System.out.println(scoring1.calcular(5,15));



    }
}
