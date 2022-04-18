package com.santander.sistema;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        final double impuesto1 = 0.0245;
        final double impuesto2 = 0.15;
        final double impuesto3 = 0.03;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el monto del premio obtenido: ");
        double premioOriginal = teclado.nextDouble();
        double premioFinal = premioOriginal -(premioOriginal * impuesto1) - (premioOriginal * impuesto2) - (premioOriginal * impuesto3);
        System.out.println("El premio final a recibir será: $" + premioFinal);
    }
}
