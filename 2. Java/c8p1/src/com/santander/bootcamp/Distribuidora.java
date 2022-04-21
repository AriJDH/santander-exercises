package com.santander.bootcamp;

import com.santander.bootcamp.modulos.NoPerecedero;
import com.santander.bootcamp.modulos.Perecedero;
import com.santander.bootcamp.modulos.Producto;

import java.util.ArrayList;

public class Distribuidora {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        Producto producto1 = new Perecedero("manteca", 100,50);
        Producto producto2 = new Perecedero("leche", 200,3);
        Producto producto4 = new Perecedero("carne", 300,2);
        Producto producto5 = new Perecedero("pollo", 400,1);
        Producto producto6 = new NoPerecedero("papel", 100,"xxx");

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);

        double total = 0;

        for (Producto producto: productos
             ) {
            total += producto.calcular(1);
        }

        System.out.println(total);
        }
}
