package com.saveRopa;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GuardaRopa {
    private HashMap<Integer, ArrayList> map;
    private int cont;

    public GuardaRopa() {
        this.map = new HashMap<>();
        this.cont = 0;
    }

    public Integer guardarPrendas(ArrayList<Prenda> listaDePrenda) {
        map.put(cont, listaDePrenda);
        cont++;
        return cont - 1;
    }

    public void mostrarPrendas() {
        for (Map.Entry<Integer, ArrayList> entrada : map.entrySet()) {
            int key = entrada.getKey();
            ArrayList<Prenda> prendas = entrada.getValue();
            System.out.println("La clave es: " + key);
            System.out.println("El valor es: " + prendas);
        }
    }

    public ArrayList<Prenda> devolverPrendas(Integer numero) {
        ArrayList<Prenda> prendasAdevolver=map.get(numero);
        map.remove(numero);
        return prendasAdevolver;
    }
}
