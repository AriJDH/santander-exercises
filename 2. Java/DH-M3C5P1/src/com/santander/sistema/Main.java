package com.santander.sistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicio1();
    }

    public static void ejercicio1() {
        Scanner input = new Scanner(System.in);
        final double[] envios = {0.07, 0.15, 0.22};
        final double ganancia = 0.25;

        System.out.print("Precio de costo: ");
        double precio_costo = input.nextDouble();
        System.out.print("Numero de fabrica: ");
        int num_fabrica = input.nextInt();

        double precio_final = precio_costo * (1 + envios[num_fabrica - 1]) * (1 + ganancia);
        System.out.printf("%nPrecio de venta: $%.2f%n", precio_final);
    }
}
