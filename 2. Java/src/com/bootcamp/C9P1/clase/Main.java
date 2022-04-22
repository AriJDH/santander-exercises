package com.bootcamp.C9P1.clase;

public class Main {
    public static void main(String[] args) {
        //wrappers();
        generics();
    }

    private static void wrappers() {
        //clases wrappers
        Integer wrapper_de_int = 10;
        wrapper_de_int.compareTo(10);
    }


    private static void generics() {
        Persona persona = new Persona("Juan");
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
