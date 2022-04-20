package com.ejercicios;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<String>();

        nombres.add("Carlos");
        nombres.add("Lois");
        nombres.add("Martin");
        nombres.add("Lucas");

        for (String nombre : nombres) {
            System.out.println(nombre);

        }
        /*
        for (int i = 0; i <nombres.size() ; i++) {
            System.out.println(nombres.get(i));
        }
         */

        //LinkedList

        List<String> nombresLink = new LinkedList<>();
        nombresLink.add("n1");
        nombresLink.add("n2");
        nombresLink.add("n3");
        nombresLink.add(2,"algo");

        //Set
        //No admite duplicados

        //TreeSet (ordendos)
        Set<String> apellidosOrdenados= new TreeSet<>();
        //HashSet (no ordenados)
        Set<String> apellidos= new HashSet<>();


        //Mapas
        //HashMap<key,value> nombreMapa
        HashMap<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"Hola");
        System.out.println(mapa.get(1));
        mapa.put(1,"Mundo");
        System.out.println(mapa.get(1));

        for(Map.Entry<Integer,String> enntrada: mapa.entrySet()){
            Integer clave= enntrada.getKey();
            String valor = enntrada.getValue();
            System.out.println();
        }
        //se sobrescribe los elementos




    }
}
