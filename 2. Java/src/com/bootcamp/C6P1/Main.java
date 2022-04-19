package com.bootcamp.C6P1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuardaRopa guardaRopa = new GuardaRopa();
        Prenda remera = new Prenda("AD","Adidas");
        Prenda pantalon = new Prenda("jean","Buffalo");

        List<Prenda> prendas = new ArrayList<>();
        prendas.add(remera);
        prendas.add(pantalon);

        Integer identificador = guardaRopa.guardarPrendas(prendas);
        guardaRopa.mostrarPrendas();
        List<Prenda> prendas_guardadas = guardaRopa.devolverPrendas(identificador);

        System.out.println("Obtengo las prendas de vuelta");
        for (Prenda prenda: prendas_guardadas) {
            System.out.println(prenda);
        }

        System.out.println("Verifico que ya no este en el guarda ropas");
        guardaRopa.mostrarPrendas();
    }
}
