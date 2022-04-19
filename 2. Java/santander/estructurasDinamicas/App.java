package com.santander.practicaListas.estructurasDinamicas;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        GuardaRopa guardaRopa = new GuardaRopa();
        List<Prenda> prendasUno = new ArrayList<>();
        Prenda prenda = new Prenda("Topper","450");
        Prenda prendaDos = new Prenda("Gorro","433");
        List<Prenda> prendasDos = new ArrayList<>();
        prendasDos.add(prenda);
        prendasDos.add(prendaDos);
        prendasUno.add(prenda);
        guardaRopa.guardarPrendas(prendasUno);
        guardaRopa.guardarPrendas(prendasDos);
        guardaRopa.mostrarPrendas();
        for (Prenda p : guardaRopa.devolverPrendas(1)) {
            System.out.println(p);
        }

    }


}
