package com.santander.estructurasControl;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        final int cantidadClientes = 7;
        final double precioFijo = 1500;
        final double precioPatrullaje = 700;

        int tipoServicio;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < cantidadClientes; i++) {
            System.out.println("seleccione tipo de servicio (1,2)");
            tipoServicio = entrada.nextInt();
            switch (tipoServicio) {
                case 1:
                    System.out.println("el precio a abonar es de: " + precioFijo);
                    break;
                case 2:
                    double sumaTotal = precioFijo + precioPatrullaje;
                    System.out.println("el precio a abonar es de: " + sumaTotal);
            }

        }
    }
}
