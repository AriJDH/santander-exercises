package com.santander.bootcamp;

public class Distribuidora {
    public static void main(String[] args) {
        Producto[] productos = new Producto[10];

        productos[0] = new Perecedero("Galletitas", 95, 30);
        productos[1] = new Perecedero("Dulce de Leche", 75, 15);
        productos[2] = new Perecedero("Leche", 106, 3);
        productos[3] = new Perecedero("Pan", 60, 2);
        productos[4] = new Perecedero("Facturas", 90, 1);

        productos[5] = new NoPerecedero("Papel Higienico", 90, "Higiene");
        productos[6] = new NoPerecedero("Pañuelitos", 20, "Higiene");
        productos[7] = new NoPerecedero("Guantes", 150, "Jardin");
        productos[8] = new NoPerecedero("Bolsa", 70, "Plastico");
        productos[9] = new NoPerecedero("Papel film", 130, "Plastico");

        double total = 0;

        System.out.printf("%n%-15s%15s%15s%n", "Producto", "Precio Unitario", "Subtotal");
        for (Producto productoActual: productos) {
            System.out.printf("%-15s%15.2f%15.2f%n", productoActual.getNombre(), productoActual.getPrecio(), productoActual.calcular(5));
            total += productoActual.calcular(5);
        }

        System.out.printf("%nTotal de productos: $%.2f%n", total);
    }
}
