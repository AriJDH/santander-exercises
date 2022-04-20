package com.ejercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App6 {
    public static void main(String[] args) {

        List<String> lista_ropa = new ArrayList<>(4);
        lista_ropa.add("rxl");
        lista_ropa.add("rl");
        lista_ropa.add("ps");
        lista_ropa.add("rxl");

        List<Integer> lista_cantidades = new ArrayList<>(4);
        lista_cantidades.add(10);
        lista_cantidades.add(5);
        lista_cantidades.add(3);
        lista_cantidades.add(13);

        HashMap<String,Integer> resultado = new HashMap<>();

        for (int i = 0; i < lista_ropa.size(); i++) {
            String ropa_actual = lista_ropa.get(i);
            int auxiliar = 0;

            if (resultado.containsKey(ropa_actual)) {
                auxiliar = resultado.get(ropa_actual);
                resultado.remove(ropa_actual);
            }

            resultado.put(ropa_actual, auxiliar + lista_cantidades.get(i));
        }

        for (Map.Entry<String, Integer> entrada : resultado.entrySet()) {
            System.out.printf("%n%s: %d", entrada.getKey(), entrada.getValue());
        }


    }
}
