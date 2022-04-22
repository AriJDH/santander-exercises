package com.bootcamp.C9P1.clase;

public class Main {
    public static void main(String[] args) {
        //wrappers();
        //generics();
        expresiones_lambda();
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
