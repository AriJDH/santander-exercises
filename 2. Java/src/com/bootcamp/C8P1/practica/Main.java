package com.bootcamp.C8P1.practica;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Pancho",500);
        int cantidadDeProductos = 10;
        double total = producto.calcular(cantidadDeProductos);

        System.out.println("Calcular " + total);

        Perecedero perecedero = new Perecedero("pancho rancio", 500, 2);
        double total_perecedero = perecedero.calcular(cantidadDeProductos);

        System.out.println("Calcular " + perecedero.getNombre() + ":" + total_perecedero);

        Producto noPerecedero = new NoPerecedero("pancho plastico", 500, "plastico");
        double total_no_perecedero = noPerecedero.calcular(cantidadDeProductos);

        System.out.println("Calcular " + noPerecedero.getNombre() + ":" + total_no_perecedero);

    }
}
