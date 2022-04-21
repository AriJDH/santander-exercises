package Polimorfismo;

import java.util.*;

public class Distribuidora {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<Producto>();

        Producto productoPerecedero1 = new Perecedero("polenta", 1,2);
        Producto productoPerecedero2= new Perecedero("aa", 2, 1 );
        Producto productoPerecedero3 = new Perecedero("aa", 2, 1 );
        Producto productoPerecedero4 = new Perecedero("aa", 2, 1 );
        Producto productoPerecedero5 = new Perecedero("aa", 2, 1 );
        Producto productoNoPerecedero1 = new NoPerecedero("aa", 1, "a");
        Producto productoNoPerecedero2 = new NoPerecedero("aa", 2, "a" );
        Producto productoNoPerecedero3 = new NoPerecedero("aa", 2, "a" );
        Producto productoNoPerecedero4 = new NoPerecedero("aa", 2, "a" );
        Producto productoNoPerecedero5 = new NoPerecedero("aa", 2, "a" );
        productos.add(productoPerecedero1);
        productos.add(productoPerecedero2);
        productos.add(productoPerecedero3);
        productos.add(productoPerecedero4);
        productos.add(productoPerecedero5);
        productos.add(productoNoPerecedero1);
        productos.add(productoNoPerecedero2);
        productos.add(productoNoPerecedero3);
        productos.add(productoNoPerecedero4);
        productos.add(productoNoPerecedero5);


        double precioTotal = 0;
        for(Producto p:productos){
            System.out.println(precioTotal += p.calcular(5));
        }



    }

}
