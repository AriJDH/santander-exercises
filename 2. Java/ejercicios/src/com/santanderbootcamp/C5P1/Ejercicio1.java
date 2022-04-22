package com.santanderbootcamp.EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precio;
        double precioVenta;
        double costoDeEnvio = 0;
        final double porcentajeGanancia = 0.25;
        int nroFabrica = 1;
        System.out.print("Ingrese el precio de costo: $");
        precio = teclado.nextDouble();
        System.out.print("Ingrese el número de fabrica: ");
        nroFabrica = teclado.nextInt();
        switch(nroFabrica) {
            case 1:
                costoDeEnvio = 0.07;
                break;
            case 2:
                costoDeEnvio = 0.15;
                break;
            case 3:
                costoDeEnvio = 0.22;
        }
        precioVenta = precio + precio * costoDeEnvio;
        precioVenta +=  precioVenta * porcentajeGanancia;
        System.out.printf("Precio estimado de venta: $%.2f", precioVenta);
    }
}
