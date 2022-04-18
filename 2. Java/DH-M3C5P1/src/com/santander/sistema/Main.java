package com.santander.sistema;

import java.util.Locale;
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
        Scanner input = new Scanner(System.in);

        final int cantidad_clientes = 7;
        boolean servicio_camara, servicio_patrullaje;
        double factura_monto;

        for (int x = 1; x <= cantidad_clientes; x++) {
            System.out.printf("%n* Cliente %d *%n", x);

            servicio_camara = false;
            servicio_patrullaje = false;
            factura_monto = 0.0;

            System.out.print("Desea el servicio de camaras (S/N) ? ");
            servicio_camara = input.nextLine().toUpperCase().equals("S");

            if (servicio_camara) {
                System.out.print("Desea el servicio de patrullaje (S/N) ? ");
                servicio_patrullaje = input.nextLine().toUpperCase().equals("S");
            }

            if (servicio_camara) {
                factura_monto += 1500.0;

                if (servicio_patrullaje) {
                    factura_monto += 700.0;
                }
            }

            System.out.printf("Monto final: $%.2f%n", factura_monto);
        }


    }
}
