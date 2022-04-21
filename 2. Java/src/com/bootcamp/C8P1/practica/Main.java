package com.bootcamp.C8P1.practica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Pancho",500);
        int cantidadDeProductos = 10;
        double total = producto.calcular(cantidadDeProductos);

        System.out.println("Calcular " + total);

        Perecedero perecedero = new Perecedero("pancho rancio", 100, 4);
        double total_perecedero = perecedero.calcular(cantidadDeProductos);

        System.out.println("Calcular " + perecedero.getNombre() + ":" + total_perecedero);

        Producto noPerecedero = new NoPerecedero("pancho plastico", 10, "plastico");
        double total_no_perecedero = noPerecedero.calcular(cantidadDeProductos);

        System.out.println("Calcular " + noPerecedero.getNombre() + ":" + total_no_perecedero);

        List<Producto> productos = new ArrayList<>();
        productos.add(perecedero);
        productos.add(noPerecedero);
        Distribuidora distribuidora = new Distribuidora(productos);

        distribuidora.vender("pancho rancio", 1);
    }
}
