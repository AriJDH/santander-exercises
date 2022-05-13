package com.ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class APp {
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Jorge", "Lopez"));
        personas.add(new Persona("Claudia", "Perez"));
        personas.add(new Persona("Julia","Gimenez"));

        personas.forEach(persona -> { System.out.println(persona); });

        personas.stream().filter((persona) -> persona.getNombre().equals("Jorge")).findFirst();
        List<Persona> pers = personas.stream().filter((persona) -> persona.getNombre().equals("Jorge")).collect(Collectors.toList());
        System.out.println(pers);


        /*DesdeHasta<Integer, Integer> dedsdeHastaNumero = new DesdeHasta<>();
        dedsdeHastaNumero.setDesde(12);
        dedsdeHastaNumero.setHasta(14);
        System.out.println(dedsdeHastaNumero.toString());

        //informe

        DesdeHasta<String, String> desdeHastaNombre = new DesdeHasta<>();
        desdeHastaNombre.setDesde("algo");
        desdeHastaNombre.setHasta("otro");
        */

        /*
        IScorging scorging;
        scorging = (a, b) -> a + b;
        System.out.println(scorging.calcular(12, 15));

        IScorging scorgingEmp2;
        scorgingEmp2 = (a, b) -> a + b * 2;
        System.out.println(scorgingEmp2.calcular(15, 10));
        */

    }
}
