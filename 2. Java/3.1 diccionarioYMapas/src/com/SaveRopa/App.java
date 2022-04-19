package com.SaveRopa;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Prenda {
    public String marca;
    public String modelo;

    public Prenda(String marcaRopa, String modeloRopa){
        marca = marcaRopa;
        modelo = modeloRopa;
    }

}

class GuardaRopa {
    public HashMap<Integer, List<Prenda>> ropaGuardada = new HashMap<>();
    public int contador = 0;


    public Integer guardarPrendas(List<Prenda>listaDePrenda) {

        ropaGuardada.put(contador, listaDePrenda);
        contador++;
        return contador - 1;

    }

    public void mostrarPrendas(){

        for (Map.Entry<Integer, List<Prenda>> entrada : ropaGuardada.entrySet()) {
            Integer ticket = entrada.getKey();
            List<Prenda> lista = entrada.getValue();
            System.out.println("\nN° de ticket: " + ticket + "\nRopa: ");
            for (Prenda p: lista) {
                System.out.println(p.modelo + " " + p.marca);
            }
        }

    }

    public List<Prenda>devolverPrendas(Integer numero){
        List<Prenda> lista = ropaGuardada.get(numero);
        System.out.println("\nSe llevaron: ");
        for (Prenda p: lista) {
            System.out.println(p.modelo + " " + p.marca);
        }
        ropaGuardada.remove(numero);
        return lista;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Prenda> listaDePrenda = new ArrayList<>();
        List<Prenda> listaDePrenda1 = new ArrayList<>();
        List<Prenda> listaDePrenda2 = new ArrayList<>();

        Prenda p1 = new Prenda("Puma", "Buzo");
        Prenda p2 = new Prenda("Zara", "Bolso");
        Prenda p3 = new Prenda("Nike", "Campera");
        Prenda p4 = new Prenda("Gucci", "Buzo");
        Prenda p5 = new Prenda("Zara", "Saco");
        Prenda p6 = new Prenda("Nike", "Campera");

        listaDePrenda.add(p1);
        listaDePrenda.add(p2);
        listaDePrenda.add(p3);
        listaDePrenda1.add(p4);
        listaDePrenda1.add(p5);
        listaDePrenda2.add(p6);

        GuardaRopa gr = new GuardaRopa();
        gr.guardarPrendas(listaDePrenda);
        gr.guardarPrendas(listaDePrenda1);
        gr.guardarPrendas(listaDePrenda2);
        gr.mostrarPrendas();
        System.out.println("\nSe retira la ropa de alguien y se saca del sistema.");
        gr.devolverPrendas(1);
        System.out.println("\nSe vuelve a mostrar la ropa que quedó.");
        gr.mostrarPrendas();

    }
}
