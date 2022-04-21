package com.satander.dh;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

    public static void main(String[] args) {

        Producto p1 = new Perecedero("Harina", 50.0, 2);
        Producto p2 = new NoPerecedero("Leche", 100.0, "No Pedecedero");
        Producto p3 = new Perecedero("Agua", 80.0, 1);
        Producto p4 = new Perecedero("Manteca", 125.0, 3);
        Producto p5 = new NoPerecedero("Queso", 450.0, "No Pedecedero");

        List<Producto> listaDeProductos = new ArrayList<>();
        listaDeProductos.add(p1);
        listaDeProductos.add(p2);
        listaDeProductos.add(p3);
        listaDeProductos.add(p4);
        listaDeProductos.add(p5);

        System.out.println("El precio final para los productos es: ");
        for (Producto prod: listaDeProductos){
            System.out.println(prod.toString() + prod.calcular(5));
        }




    }
}
