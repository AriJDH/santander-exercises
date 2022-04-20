package com.ejercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App5 {

    public static void main(String[] args) {

        HashMap<String, Integer> map=new HashMap<>();
        List<String> productos = new ArrayList<String>();
        List<Integer> cantidades = new ArrayList<Integer>();
        productos.add("remeraxl");
        productos.add("pantalonS");
        productos.add("pantalonS");
        cantidades.add(3);
        cantidades.add(5);
        cantidades.add(5);
        for (int i = 0; i < productos.size(); i++) {
            map.put(productos.get(i),cantidades.get(i));
        }
        for (Map.Entry<String, Integer> entrada : map.entrySet()) {
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
        }



    }

}
