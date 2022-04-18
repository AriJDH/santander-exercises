package com.santander.bootcamp;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int service;

        for (int i=0; i<7; ++i) {
            System.out.println("Ingrese el servicio que quiere (1 o 2)");
            service = input.nextInt();
            if (service == 1) {
                System.out.println("Monto final a pagar: $1500");
            } else if (service == 2) {
                System.out.println("Monto final a pagar: $2200");
            } else {
                System.out.println("Opcion incorrecta");
            }
        }
    }
}
