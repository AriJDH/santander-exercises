package com.bootcamp.C6P1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private HashMap<Integer, List<Prenda>> guarda_ropa;
    private int contador;

    public GuardaRopa() {
        guarda_ropa = new HashMap<>();
        contador = 0;
    }

    public Integer guardarPrendas(List<Prenda> prendas) {
        contador++;
        guarda_ropa.put(contador, prendas);
        return contador;
    }

    public void mostrarPrendas() {
        System.out.println("Mostrando prendas guardadas");
        for(Map.Entry<Integer,List<Prenda>> entrada : guarda_ropa.entrySet()){
            Integer id = entrada.getKey();
            List<Prenda> prendas = entrada.getValue();
            System.out.println("Identificador: " + id + "\n Prendas guardadas: ");
            for (Prenda prenda : prendas) {
                System.out.println(" " + prenda);
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer identificador) {
        System.out.println("Devolviendo prendas");
        return guarda_ropa.remove(identificador);
    }
}
