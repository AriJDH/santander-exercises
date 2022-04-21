package com.ej;

import java.util.ArrayList;

public class Distribudora {


    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Producto p1= new Perecedero("carne",2000,5);
        Producto p2= new Perecedero("fideo",12,1);
        Producto p3= new Perecedero("atun",500,3);
        Producto p4= new NoPere("choclo",200,"enlatado");
        Producto p5= new NoPere("arveja",12,"enlatado");
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        double acum=0;
        for (Producto p:productos) {
            acum=acum+p.calcular(5 );
        }
        System.out.println(acum);
    }
}
