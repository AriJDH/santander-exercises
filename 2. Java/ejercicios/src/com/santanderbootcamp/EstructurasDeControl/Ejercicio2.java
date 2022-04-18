package com.santanderbootcamp.EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sueldo;
        System.out.print("Ingrese el sueldo: ");
        sueldo = teclado.nextDouble();
        if ((int)sueldo <= 20000) {
            System.out.println("Le corresponde 20% de aumento");
        }
        else {
            if ((int)sueldo <= 45000) {
                System.out.println("Le corresponde 10% de aumento");
            }
            else {
                System.out.println("Le corresponde 5% de aumento");
            }
        }
    }
}
