package com.santander.sistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        ejercicio3();
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

    public static void ejercicio2() {
        Scanner input = new Scanner(System.in);

        System.out.print("D.N.I.: ");
        String dni = input.nextLine();
        System.out.print("Sueldo: $");
        double sueldo = input.nextDouble();
        double aumento = 0.0;

        if (sueldo <= 20_000) {
            aumento = 0.20;
        } else if (sueldo <= 45_000) {
            aumento = 0.10;
        } else {
            aumento = 0.05;
        }

        System.out.printf("Porcentaje de aumento: %.2f%%%n", aumento * 100);
        System.out.printf("Sueldo: $%.2f%n", sueldo * (1 + aumento));
    }

    public static void ejercicio3() {

    }
}
