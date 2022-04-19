package com.santander.practicaListas.estructurasDinamicas;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private HashMap<Integer, List<Prenda>> prendas;
    private int contador;

    public GuardaRopa() {
        this.prendas = new HashMap<>();
    }

    public Integer guardarPrendas(List listaPrendas) {
        prendas.put(contador, listaPrendas);
        int auxiliar = this.contador;
        contador++;
        return auxiliar;
    }

    public void mostrarPrendas(){
        System.out.println("motrando prendas");
        for (Map.Entry<Integer, List<Prenda>> p : this.prendas.entrySet()) {
            System.out.println("prenda: "+p.getValue() + " numero: " + p.getKey());
        }
    }


    public List<Prenda> devolverPrendas(Integer numero){
        System.out.println("Sus prendas son : ");
        return prendas.remove(numero);
    }


}
