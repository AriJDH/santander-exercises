package com.bootcamp.C8P1.practica;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Pancho",500);
        int cantidadDeProductos = 10;
        double total = producto.calcular(cantidadDeProductos);

        System.out.println("Calcular: " + total);
    }
}
