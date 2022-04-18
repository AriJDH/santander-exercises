package com.santander.bootcamp;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su número de DNI: ");
        int dni = input.nextInt();
        System.out.println("Ingrese su sueldo: ");
        double sueldo = input.nextDouble();

        if (sueldo <= 20000) {
            System.out.println("Le corresponde un 20% de aumento. Nuevo sueldo: " + (sueldo+sueldo/100*20));
        } else if (sueldo <= 45000) {
            System.out.println("Le corresponde un 10% de aumento. Nuevo sueldo: " + (sueldo+sueldo/100*10));
        }
        else {
            System.out.println("Le corresponde un 5% de aumento. Nuevo sueldo: " + (sueldo+sueldo/100*5));
        }
    }
}
