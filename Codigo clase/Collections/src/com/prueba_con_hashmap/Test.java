package com.prueba_con_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Persona persona1 = new Persona(123);
        Animal animal1 = new Animal("pesho");

        HashMap<Integer, Object> mapa = new HashMap<>();
        mapa.put(1, persona1);
        mapa.put(2, animal1);

        //No admite filtrar por clase aun si la misma hereda de la clase que recibe el hashmap
        /*for (Map.Entry<Integer,Persona> persona:
             mapa.entrySet()) {

         */

    }
}
