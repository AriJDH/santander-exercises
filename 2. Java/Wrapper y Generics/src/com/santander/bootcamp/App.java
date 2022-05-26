package com.santander.bootcamp;

import java.util.ArrayList;
import java.util.Optional;

public class App {
    public static void main(String[] args) {

        /*

    DesdeHasta<Integer, Integer> desdeHastaNumero = new DesdeHasta<>();

    desdeHastaNumero.setDesde(12);
    desdeHastaNumero.setHasta(14);

    DesdeHasta<String, String> desdeHastaNombre = new DesdeHasta<>();

    desdeHastaNombre.setHasta("algo");
    desdeHastaNombre.setHasta("otro");

                                */

    ArrayList<Persona> personas = new ArrayList<>();

    personas.add(new Persona("Juan", "gomez"));
    personas.add(new Persona("Juan2", "gomez"));
    personas.add(new Persona("Juan3", "gomez"));


    Optional<Persona> persona2 = personas.stream().filter((persona) -> persona.getNombre().equals("Juan3")).findFirst();

        System.out.println(persona2);
    }


}
