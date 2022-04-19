package com.santander;

import com.santander.colecciones.GuardaRopa;
import com.santander.colecciones.Prenda;

import java.util.LinkedList;
import java.util.List;

public class EjercitacionColecciones {
    public static void main(String[] args) {
        List<Prenda> listaDePrendas1 = new LinkedList<>();
        listaDePrendas1.add(new Prenda("Gucci", "X345"));
        listaDePrendas1.add(new Prenda("Dolce", "Large"));
        GuardaRopa guardaropa = new GuardaRopa();
        int codigo = guardaropa.guardarPrendas(listaDePrendas1);
        guardaropa.mostrarPrendas();
        List<Prenda> prendasDevueltas = guardaropa.devolverPrendas(codigo);
        guardaropa.mostrarPrendas();
    }
}


