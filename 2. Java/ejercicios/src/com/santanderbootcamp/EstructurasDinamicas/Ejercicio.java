package com.santanderbootcamp.EstructurasDinamicas;

import java.util.*;

class Prenda {
    private String marca;
    private String modelo;
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
        for(Map.Entry<Integer, List<Prenda>> listaDePrenda: dicPrendas.entrySet()) {
            System.out.println("En el lugar " + listaDePrenda.getKey() + " están guardadas las prendas: ");
            for(Prenda prenda: listaDePrenda.getValue()) {
                System.out.println("->  "+ prenda.marca() + "  -  " + prenda.modelo());
            }
        }
    }
    public List<Prenda> devolverPrendas(Integer numero){
        List<Prenda> prenda = dicPrendas.get(numero);
        dicPrendas.remove(numero);
        System.out.println("Se retiraron las prendas.");
        return prenda;
    }
}

public class Ejercicio {
    public static void main(String[] args) {
        Guardarropa guardaRopa = new Guardarropa();
        Prenda prenda1 = new Prenda("Nike", "Zapatillas");
        Prenda prenda2 = new Prenda("Adidas", "Buzo");
        List<Prenda> listaPrendas = new ArrayList<>();
        listaPrendas.add(prenda1);
        listaPrendas.add(prenda2);
        int codigo = guardaRopa.guardarPrendas(listaPrendas);
        guardaRopa.mostrarPrendas();
        System.out.println();
        List<Prenda> listaPrenda2 = guardaRopa.devolverPrendas(codigo);
        guardaRopa.mostrarPrendas();

        //solo para verificar que se hayan extraido correctamente
        System.out.println("\nLas prendas extraídas fueron:");
        for(Prenda prenda: listaPrenda2) {
            System.out.println("--> " + prenda.marca() + " - " + prenda.modelo());
        }
    }
}
