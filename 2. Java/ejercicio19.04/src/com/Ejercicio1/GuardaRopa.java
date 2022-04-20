package com.Ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class GuardaRopa {
    HashMap<Integer, ArrayList> diccionario;
        private int numeroGuardaropa;

public GuardaRopa(){
    this.numeroGuardaropa = 0;
    this.diccionario = new HashMap<>();

}

    public Integer guardarPrendas(ArrayList<Prenda> listaDePrenda){
        diccionario.put(numeroGuardaropa, listaDePrenda);
        numeroGuardaropa++;
        return numeroGuardaropa;
    }
    public void mostrarPrendas(){
    for(Map.Entry<Integer, ArrayList> mostrar: diccionario.entrySet()){
        int id = mostrar.getKey();
        ArrayList<Prenda> prendas = mostrar.getValue();
        System.out.println(id);
        System.out.println(prendas);
    }


    }
    public ArrayList<Prenda> devolverPrendas(Integer numero){
        for(Map.Entry<Integer, ArrayList> mostrar: diccionario.entrySet()){
            int id = mostrar.getKey();
            if(id == numero){
                ArrayList<Prenda> prendas;
                prendas = mostrar.getValue();
                diccionario.remove(id);
                return prendas;
            }

        }
        return null;

    }





}
