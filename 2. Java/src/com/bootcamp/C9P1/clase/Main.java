package com.bootcamp.C9P1.clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //wrappers();
        //generics();
        //expresiones_lambda();
        streams();
    }

    private static void streams() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Gomez"));
        personas.add(new Persona("Pedro", "Gomez"));
        personas.add(new Persona("Maria", "Gomez"));

        //metodo stream
        personas.forEach(persona -> {
            System.out.println(persona);
        });

        Optional<Persona> persona_primera = personas.stream().filter(persona -> persona.getNombre().equals("Juan")).findFirst();
        System.out.println(persona_primera);

        List<Persona> personas_ret = personas.stream().filter(persona -> persona.getNombre().equals("Juan")).collect(Collectors.toList());
        System.out.println(personas_ret);

        //Referencias a metodos, sintax sugar
        //identico al forEach con expresion lambda
        personas.forEach(System.out::println);

    }

    private static void expresiones_lambda() {
        IScoring scoring;
        scoring = (a, b) -> a + b;

        int res = scoring.calcular(12, 15);

        System.out.println(res);

        //evitas tener que crear una clase que herede de la interfaz para
        // implementar estos calculos
        scoring = (a,b) -> a + (b * 2);
        res = scoring.calcular(12, 15);
        System.out.println(res);

    }

    private static void wrappers() {
        //clases wrappers
        Integer wrapper_de_int = 10;
        wrapper_de_int.compareTo(10);
    }


    private static void generics() {
        Persona persona = new Persona("Juan", "Gomez");
        DesdeHasta<Integer, Integer> desdeHastaNumero = new DesdeHasta<>(20, 30);
        System.out.println(desdeHastaNumero);

        DesdeHasta<String, String> desdeHastaNombre = new DesdeHasta<>("Agustin", "Marcelo");
        System.out.println(desdeHastaNombre);

        PersonaDAOImpl personas = new PersonaDAOImpl();
        personas.agregar(persona);

        Persona persona_ret = personas.buscarElemento("Juan");
        System.out.println(persona_ret);
    }
}
