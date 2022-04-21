package main;

import clases.*;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        Producto [] productos= new Producto[5];
        productos[0]=new Perecedero("Carne",55,3);
        productos[1]=new Perecedero("Leche",25,2);
        productos[2]= new Perecedero("Pescado",43,1);
        productos[3]=new Perecedero("Yogurt",155,635);
        productos[4]=new NoPerecedero("Azucar",15,"Azucarada");

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i].getNombre()+ " EL PRECIO DE 5 PRODUCTOS: "+productos[i].calcular(5));
        }

    }
}
