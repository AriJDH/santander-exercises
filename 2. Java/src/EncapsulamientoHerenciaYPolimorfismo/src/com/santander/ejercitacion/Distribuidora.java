package com.santander.ejercitacion;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        Productos[] productos = new Productos[10];
        double total = 0;
        Perecedero yogurt = new Perecedero("Yogurt", 120, 4);
        Perecedero yogurt2 = new Perecedero("Yogurt", 120, 2);
        Perecedero chocolate = new Perecedero("Chocolate", 200, 1);
        Perecedero chocolate2 = new Perecedero("Chocolate Arcor", 260, 3);
        Perecedero tomate = new Perecedero("Tomate Puré", 100, 10);
        NoPerecedero fideos = new NoPerecedero("Fideos", 80, "Harinas");
        NoPerecedero lentejas = new NoPerecedero("Lentejas", 50, "Legumbres");
        NoPerecedero fideos2 = new NoPerecedero("Fideos Moñitos", 75, "Harinas");
        NoPerecedero lentejas2 = new NoPerecedero("Lentejas Grandes", 75, "Legumbres");
        NoPerecedero miel = new NoPerecedero("Miel", 300, "Dulces");
        productos[0] = yogurt;
        productos[1] = yogurt2;
        productos[2] = chocolate;
        productos[3] = chocolate2;
        productos[4] = tomate;
        productos[5] = fideos;
        productos[6] = lentejas;
        productos[7] = fideos2;
        productos[8] = lentejas2;
        productos[9] = miel;
        for(int i=0; i< productos.length; i++) {
            total += productos[i].calcular(5);
        }
        System.out.println(total);
    }
}
