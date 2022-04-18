package com.santander.bootcamp;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del empleado: ");
        int sueldo = scanner.nextInt();

        if (sueldo > 45000) {
            System.out.println("Corresponde 5% de aumento ");
        } else if (sueldo < 20000) {
            System.out.println("Corresponde 20% de aumento ");
        } else {
            System.out.println("Corresponde 10% de aumento ");
        }
    }
}
