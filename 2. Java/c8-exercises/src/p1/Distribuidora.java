package p1;

import p1.models.NoPerecedero;
import p1.models.Perecedero;
import p1.models.Producto;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        int size=2;
        Producto[] productos = new Producto[size];
        productos[0] = new NoPerecedero("name", 0, "type");
        productos[1] = new Perecedero("name", 10, 2);

        double sum = 0;
        for (int i=0; i<size; ++i) {
            sum += productos[i].calcular(5);
        }
        System.out.println("Final price: $" + sum);

    }
}
