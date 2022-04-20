package com.ejercicio;

import java.util.HashMap;
import java.util.Map;

public class App2 {
    public static void main(String[] args) {

        HashMap<Integer, String > mapa = new HashMap<>();

        mapa.put(10,"San Francisco");
        mapa.put(30,"San Carlos");
        mapa.put(50, "Otra ciudad");

        //String ciudad = mapa.get(50);
        //System.out.println(ciudad);

        for (Map.Entry<Integer,String> ciudad: mapa.entrySet() ) {
            System.out.println( ciudad.getKey() );
            System.out.println( ciudad.getValue());
        }

        mapa.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));



    }
}
