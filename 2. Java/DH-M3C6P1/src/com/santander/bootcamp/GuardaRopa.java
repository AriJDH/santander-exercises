package com.santander.bootcamp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    HashMap<Integer, List<Prenda>> diccionario;
    int contador;

    GuardaRopa() {
        this.diccionario = new HashMap<>();
        this.contador = 0;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda) {
        this.diccionario.put(++this.contador, listaDePrenda);
        return this.contador;
    }

    public void mostrarPrendas() {
        System.out.printf("%nLista:%n");
        for(Map.Entry<Integer, List<Prenda>> entrada_actual : this.diccionario.entrySet()) {
            for (Prenda prenda_actual : entrada_actual.getValue()) {
                System.out.printf("%d - %s %s%n", entrada_actual.getKey(), prenda_actual.marca, prenda_actual.modelo);
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        return this.diccionario.remove(numero);
    }
}
