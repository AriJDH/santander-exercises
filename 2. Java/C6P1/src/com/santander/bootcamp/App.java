package com.santander.bootcamp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Prenda> listaDePrendas = new LinkedList<>();

        Prenda prenda01 = new Prenda("Nike", "air");
        Prenda prenda02 = new Prenda("Adidas", "xxx");
        listaDePrendas.add(prenda01);
        listaDePrendas.add(prenda02);

        /*

        Prenda prenda01 = new Prenda("Nike", "air");
        Prenda prenda02 = new Prenda("Adidas", "xxx");
        Prenda prenda03 = new Prenda("Puma", "yyy");
        listaDePrendas.add(prenda01);
        listaDePrendas.add(prenda02);
        listaDePrendas.add(prenda03);

        List<Prenda> listaDePrendas2 = new LinkedList<>();
        Prenda prenda1 = new Prenda("Nike2", "air2222");
        Prenda prenda2 = new Prenda("Adidas2", "xxx2222");
        Prenda prenda3 = new Prenda("Puma2", "yyy2222");
        listaDePrendas2.add(prenda1);
        listaDePrendas2.add(prenda2);
        listaDePrendas2.add(prenda3); */

        GuardarRopa guardarRopas1 = new GuardarRopa();

        int codigo = guardarRopas1.guardarPrendas(listaDePrendas);
        // guardarRopas1.guardarPrendas(listaDePrendas2);

        System.out.println("Prendas obtenidas con codigo: " + guardarRopas1.devolverPrendas(codigo));
        //guardarRopas1.mostrarPrendas();

    }

}

class Prenda {

    private String marca;
    private String modelo;

    public Prenda(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'';
    }
}

class GuardarRopa {

    private HashMap<Integer, List> mapa = new HashMap<>();
    private int contador;

    public GuardarRopa(){
        contador = 0;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrendas){
        mapa.put(contador, listaDePrendas);
        contador++;
        return contador-1;
    }

    public void mostrarPrendas(){
        mapa.forEach((k,v) -> System.out.println("Codigo: " + k + ": Prendas: " + v.toString()));
    }

    public List<Prenda> devolverPrendas(Integer numero){
        return mapa.get(numero);
    }
}
