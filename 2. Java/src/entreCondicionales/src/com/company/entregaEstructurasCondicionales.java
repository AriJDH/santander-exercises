package com.company;
import java.util.Scanner;

public class entregaEstructurasCondicionales {
    public static void main(String[] args) {
        //Ejercicio1:
        double proxProd;
        int respuesta;
        do {
            double precioDeVenta = 0;
            int porcentajeDeGanancias = 25;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el costo del producto: ");
            double costoProducto = teclado.nextInt();
            System.out.println("Ingrese el número de la fábrica desde la cual lo adquirió: ");
            int numFabrica = teclado.nextInt();
            switch (numFabrica) {
                case 1:
                    precioDeVenta = costoProducto * 1.07;
                    break;
                case 2:
                    precioDeVenta = costoProducto * 1.15;
                    break;
                case 3:
                    precioDeVenta = costoProducto * 1.22;
                    break;
            }
            precioDeVenta = precioDeVenta * 1.25;
            System.out.println("El precio de venta del producto es: " + precioDeVenta);
            System.out.println("¿Desea agregar más productos? Sí -> 1, No -> 2");
            respuesta = teclado.nextInt();
        } while (respuesta == 1);
    }
}