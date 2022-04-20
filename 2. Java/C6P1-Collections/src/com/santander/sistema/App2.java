package com.santander.sistema;

import java.util.HashMap;
import java.util.Map;

public class App2 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(10,"San Francisco");
        mapa.put(30,"San Carlos");
        mapa.put(50,"Otra ciudad");

        String ciudad = mapa.get(50);

        System.out.println(ciudad);

        for (Map.Entry<Integer,String> ciudad1: mapa.entrySet() ) {
            System.out.println(ciudad1.getKey() );
            System.out.println(ciudad1.getValue());
        }

        //Otra manera
        mapa.forEach( (k,v) -> System.out.println("key = " + k + ", Value = " + v) );
    }
}
