package com.EjerciciosDeClase;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        //int variable = 10;
        //Integer variable1 = 0;
        /*

        //Primer ejemplo-----------------------------------------------------------
        DesdeHasta<Integer,Integer> desdeHastaNumero = new DesdeHasta<>();

        desdeHastaNumero.setDesde(12);
        desdeHastaNumero.setHasta(14);

        //informe

        DesdeHasta<String,String> desdeHastaNombre = new DesdeHasta<>();
        desdeHastaNombre.setDesde("algo");
        desdeHastaNombre.setHasta("otro");
        System.out.println(desdeHastaNumero);
        System.out.println(desdeHastaNombre);
        */

        //Segundo ejemplo -----------------------------------------------------------------------------------
        /*
        IScoring scoring;
        scoring = (a,b) -> a+b;
        System.out.println(scoring.calcular(12,15));

        IScoring scoringEmpresa2;
        scoringEmpresa2 = (a,b) -> a + b * 2;
        System.out.println(scoringEmpresa2.calcular(5,12));
         */

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan","Gomez"));
        personas.add(new Persona("Pedro","Gomez"));
        personas.add(new Persona("Pedro","Gomez"));

        personas.forEach(persona -> {
            System.out.println(persona);
        });

        Optional<Persona> persona1 = personas.stream().filter((persona) -> persona.getNombre().equals("Juan")).findFirst();
        System.out.println(persona1);

        List<Persona> pers = personas.stream().filter((persona) -> persona.getNombre().equals("Juan")).collect(Collectors.toList());
        System.out.println(pers);
        pers.forEach(System.out::println);

    }
}
