package com.saveRopa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Prenda p1 = new Prenda("vans", "nueva");
        Prenda p2 = new Prenda("chevrolet", "no se");
        Prenda p3 = new Prenda("joda", "12");
        Prenda p4 = new Prenda("asd", "no 33");
        ArrayList<Prenda> prendas1 = new ArrayList<Prenda>();
        prendas1.add(p1);
        prendas1.add(p2);
        ArrayList<Prenda> prendas2 = new ArrayList<Prenda>();
        prendas2.add(p3);
        prendas2.add(p4);
        GuardaRopa g1 = new GuardaRopa();
        int miCodigo1 = g1.guardarPrendas(prendas1);
        int miCodigo2 = g1.guardarPrendas(prendas2);
        System.out.println(miCodigo1);
        System.out.println(miCodigo2);
        g1.mostrarPrendas();
        ArrayList<Prenda> prendasDevueltas = g1.devolverPrendas(miCodigo1);
        g1.mostrarPrendas();
        System.out.print("devueltas:");
        System.out.println(prendasDevueltas);

    }
}
