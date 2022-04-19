package com.santanderbootcamp.EstructurasDinamicas;

import java.util.*;

class Prenda {
    private final String marca;
    private final String modelo;
    Prenda(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String marca() {
        return marca;
    }

    public String modelo() {
        return modelo;
    }
}

class Guardarropa {
    private HashMap<Integer, List<Prenda>> dicPrendas = new HashMap<>();
    private int contador = 0;

    public int guardarPrendas(List<Prenda> listaDePrenda) {
        contador++;
        dicPrendas.put(contador, listaDePrenda);
        return contador;
    }

    public void mostrarPrendas() {
        if (dicPrendas.isEmpty()) {
            System.out.println("No hay prendas.");
        }
        else {
            for (Map.Entry<Integer, List<Prenda>> listaDePrenda : dicPrendas.entrySet()) {
                System.out.println("En el lugar " + listaDePrenda.getKey() + " están guardadas las prendas: ");
                for (Prenda prenda : listaDePrenda.getValue()) {
                    System.out.println("->  " + prenda.marca() + "  -  " + prenda.modelo());
                }
            }
        }
    }
    public List<Prenda> devolverPrendas(Integer numero){
        List<Prenda> prenda = dicPrendas.get(numero);
        dicPrendas.remove(numero);
        return prenda;
    }
}

public class Ejercicio {
    public static void main(String[] args) {
        Guardarropa guardaRopa = new Guardarropa();
        int codigo;
        List<Prenda> listaPrendas = new ArrayList<>();
        listaPrendas.add(new Prenda("Nike", "Zapatillas"));
        listaPrendas.add(new Prenda("Adidas", "Buzo"));

        codigo = guardaRopa.guardarPrendas(listaPrendas);
        guardaRopa.mostrarPrendas();
        System.out.println();
        List<Prenda> listaPrenda2 = guardaRopa.devolverPrendas(codigo);
        guardaRopa.mostrarPrendas();

        //para verificar que se hayan extraido correctamente
        System.out.println("\nLas prendas extraídas fueron:");
        for(Prenda prenda: listaPrenda2) {
            System.out.println("--> " + prenda.marca() + " - " + prenda.modelo());
        }
    }
}
