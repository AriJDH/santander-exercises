package com.resolucion.test;

import com.resolucion.clases.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Prenda> listaDePrendas1 = new LinkedList<Prenda>();
        listaDePrendas1.add(new Prenda("Gucci", "X345"));
        listaDePrendas1.add(new Prenda("Idk", "Xt4D"));
        List<Prenda> listaDePrendas2 = new LinkedList<Prenda>();
        listaDePrendas2.add(new Prenda("Supreme", "DS43"));
        listaDePrendas2.add(new Prenda("Bross", "G76S"));
        GuardaRopa guardaRopa = new GuardaRopa(0, new HashMap<>());
        System.out.println("Voy a guardar mis dos listas de prendas");
        int ticket1 = guardaRopa.guardarPrendas(listaDePrendas1);
        int ticket2= guardaRopa.guardarPrendas(listaDePrendas2);
        System.out.println("Recibi el ticket con el id " + ticket1 + " para la primera lista");
        System.out.println("Recibi el ticket con el id " + ticket2 + " para la segunda lista");
        System.out.println("----------------------------------");
        System.out.println("Voy a ver la lista de prendas");
        guardaRopa.mostrarPrenda();
        System.out.println("Quiero mi primera lista de prendas devuelta");
        List<Prenda> listaDePrendasDevolucion=new LinkedList<Prenda>();
        listaDePrendasDevolucion.addAll(guardaRopa.devolverPrendas(ticket1));
        System.out.println("----------------------------------");
        System.out.println("Verifico que me llegaron todas las prendas");
        for (Prenda prenda : listaDePrendasDevolucion) {
            System.out.println(prenda.toString());
        }
        System.out.println("----------------------------------");
        System.out.println("Voy a ver la lista de prendas que quedaron");
        guardaRopa.mostrarPrenda();


    }
}
