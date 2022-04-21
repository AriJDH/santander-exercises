package bootcamp.dia21;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList();
        double precioTotal = 0;

        listaProductos.add(new Perecedero(3, "Aceite", 70));
        listaProductos.add(new Perecedero(1, "Tomate", 23));
        listaProductos.add(new Perecedero(10, "Mayonesa", 132));
        listaProductos.add(new Perecedero(25, "Carne", 270));
        listaProductos.add(new Perecedero(50, "Palmito", 132));

        listaProductos.add(new NoPerecedero("asd1", "Yerba", 200));
        listaProductos.add(new NoPerecedero("asd2", "Cafe", 220));
        listaProductos.add(new NoPerecedero("asd3", "Arroz", 170));
        listaProductos.add(new NoPerecedero("asd4", "Galletita", 100));
        listaProductos.add(new NoPerecedero("asd5", "Lenteja", 110));



        for (Producto producto: listaProductos) {
            precioTotal = precioTotal + producto.calcular(1);
        }

        System.out.println("El precio total a pagar es de: " + precioTotal);

    }
}
