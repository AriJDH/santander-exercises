package com.santander.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Prenda> prendas0 = new ArrayList<>();
        prendas0.add(new Prenda("Converse", "Remera"));
        prendas0.add(new Prenda("Nike", "Pantalon"));

        List<Prenda> prendas1 = new ArrayList<>();
        prendas1.add(new Prenda("Adidas", "Campera"));
        prendas1.add(new Prenda("Vans", "Gorra"));
        prendas1.add(new Prenda("Legacy", "Jean"));

        GuardaRopa guardaRopa0 = new GuardaRopa();

        int id0 = guardaRopa0.guardarPrendas(prendas0);
        System.out.printf("%nSe guardo en %d%n", id0);

        guardaRopa0.mostrarPrendas();

        int id1 = guardaRopa0.guardarPrendas(prendas1);
        System.out.printf("%nSe guardo en %d%n", id1);

        guardaRopa0.mostrarPrendas();

        List<Prenda> auxiliar = guardaRopa0.devolverPrendas(id0);

        guardaRopa0.mostrarPrendas();
    }
}
