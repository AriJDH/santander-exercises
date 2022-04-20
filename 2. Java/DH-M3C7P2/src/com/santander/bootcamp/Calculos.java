package com.santander.bootcamp;

import java.util.Scanner;

public class Calculos {
    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.printf("Ingrese un numero: ");
        double a = input.nextDouble();

        System.out.printf("Ingrese otro numero: ");
        double b = input.nextDouble();

        System.out.printf("%nEl mayor es %f", mayor(a, b));
        System.out.printf("%nEl menor es %f", menor(a, b));
        System.out.printf("%nLa potencia es %f", potencia(a, b));
        System.out.printf("%nEl coseno del primero es %f", coseno(a));
        System.out.printf("%nLa raiz del primero es %f", raiz(a));
        System.out.printf("%nUn numero aleatorio %d", aleatorio());
        System.out.println();
    }

    public static double mayor(double a, double b) {
        return Math.max(a, b);
    }

    public static double menor(double a, double b) {
        return Math.min(a, b);
    }

    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static double coseno(double a) {
        return Math.cos(a);
    }

    public static double raiz(double a) {
        return Math.sqrt(a);
    }

    public static int aleatorio() {
        return (int) (Math.random() * 1000);
    }
}
