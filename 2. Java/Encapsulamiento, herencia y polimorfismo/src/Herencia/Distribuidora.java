package Herencia;

import java.util.ArrayList;

public class Distribuidora {
    public static void main(String[] args) {
        Producto[] productos = new Producto[5];

        productos[0] = new Perecedero("azucar", 50, 2);
        productos[1] = new Perecedero("sal", 3, 3);
        productos[2] = new Perecedero("pollo", 43, 1);
        productos[3] = new Perecedero("res", 50, 2);
        productos[4] = new Perecedero("pescado", 10, 3);

        double total= 0;
        for(Producto producto: productos){
            total+= producto.calcular(3);

        }
        System.out.println(total);





    }
    }