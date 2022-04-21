package com.ejercicio;

import com.ejercicio.modelos.NoPerecedero;
import com.ejercicio.modelos.Perecedero;
import com.ejercicio.modelos.Productos;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {

        Productos p1 = new Perecedero("Tomate", 100, 2);
        Productos p2 = new NoPerecedero("Fideos", 500, "alguno");
        Productos p3 = new NoPerecedero("Atun en lata", 700, "pescáo");
        Productos p4 = new Perecedero("Leche", 250, 3);
        Productos p5 = new Perecedero("Manteca", 370, 1);
        Productos p6 = new Perecedero("Supremas de pollo", 600, 5);
        Productos p7 = new NoPerecedero("Yerba", 300, "Union, la mejor de todas");

        List<Productos> productos = new ArrayList<>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        productos.add(p7);

        System.out.println(productos);

        for (Productos p: productos) {
            System.out.printf("El valor de los %s es de: %.2f\n", p.getNombre(), p.calcular(5));
        }

    }
}
