package com.santander.sistema;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class EjercicioPractico {
    public static void main(String[] args) {
        //Creo e inicializo la lista de prendas
        List<Prenda> listaDePrendas1 = new LinkedList<>();
        listaDePrendas1.add(new Prenda("Gucci","X345"));
        listaDePrendas1.add(new Prenda("Dolce","Large"));
        System.out.println(listaDePrendas1);

        List<Prenda> listaDePrendas2 = new LinkedList<>();
        listaDePrendas2.add(new Prenda("TodoModa","A675"));
        listaDePrendas2.add(new Prenda("Zahara","Small"));
        System.out.println(listaDePrendas2);

        //Creo e inicializo un guardaRopas
        HashMap<Integer, List<Prenda>> diccionario = new HashMap();
        int contador = 0;
        GuardaRopa guardaRopa = new GuardaRopa(diccionario,contador);
        //guardo y muestro la lista1
        int numero = guardaRopa.guardarPrendas(listaDePrendas1);
        //System.out.println(guardaRopa.mostrar_prendas());
        //guardo y muestro la lista2
        int numero1 = guardaRopa.guardarPrendas(listaDePrendas2);
        //System.out.println(guardaRopa.mostrar_prendas());
        //Devuelvo la prenda
        System.out.println(guardaRopa.devolver_Prendas(numero));
    }
}
