package com.santander;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        int cantidad = 5;
        List<Producto> productos = new ArrayList<>();
        Producto p1 = new Producto("Pepsi", 300);
        NoPerecedero p2 = new NoPerecedero("Arvejas", 100,"lata");
        Perecedero p3 = new Perecedero("Papas", 250,2);

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);


        for(Producto prod: productos){
            System.out.printf("%.2f\n",prod.calcular(5));
        }









    }
}
