package com.auxiliar;
import java.util.HashMap;
import java.util.Map;

public class app2 {
    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(10, "San Francisco");
        mapa.put(30, "San Carlos");
        mapa.put(50, "Otra Ciudad");

        //String ciudad = mapa.get(30);
        //System.out.println(ciudad);

        for (Map.Entry<Integer, String> c: mapa.entrySet()) {
            System.out.println(c.getKey());
            System.out.println(c.getValue());
        }
    }
}
