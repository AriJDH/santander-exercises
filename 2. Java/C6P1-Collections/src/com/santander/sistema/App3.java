package com.santander.sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App3 {
    public static void main(String[] args) {
        //Tengo una lista de productos (se repiten: remera Xl rojo más de una vez)
        //y tengo una lista de cantidades
        // productos = {"rxl", "rl", "ps","rxl"}
        // cantidades = {10  ,   5    , 3   ,13}

        //quiero unificar los productos por codigo por mapa
        //Salida: mapa con cantidades unificadas
        //<String,Integer>
        //rxl: 23, rl: 5, ps: 3

        //1 cargar listas
        //2 recorrer y armar el mapa
        //3 mostrar el mapa

        //inicializo y creo las listas
        List<String> productos = new ArrayList();
        List<Integer> cantidades = new ArrayList();

        //cargo las listas
        productos.add("rxl");
        productos.add("rl");
        productos.add("ps");
        productos.add("rxl");

        cantidades.add(10);
        cantidades.add(5);
        cantidades.add(3);
        cantidades.add(13);

        System.out.println(productos);
        System.out.println(cantidades);

        HashMap<String, Integer> resultado = new HashMap<>();
        String prod_actual;
        int valor_ant = 0;
        int suma = 0;
        for (int i = 0; i < productos.size(); i++) {
            prod_actual = productos.get(i);
            if (resultado.containsKey(prod_actual)){
                valor_ant = resultado.get(prod_actual);
                resultado.put(prod_actual,valor_ant + cantidades.get(i));
            }
            else {
                resultado.put(prod_actual, cantidades.get(i));
            }
        }
        System.out.println(resultado);
    }
}
