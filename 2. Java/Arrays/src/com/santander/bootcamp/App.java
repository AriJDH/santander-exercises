package com.santander.bootcamp;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantas notas desea cargar?");
        int cant_notas = scanner.nextInt();
        double notas[] = new double[cant_notas];

        double suma = 0;

        for (int i = 1; i < cant_notas+1;i++) {
            System.out.println("Introduzca la nota #" + i);
            double respuesta = scanner.nextDouble();
            if (respuesta > 0 && respuesta <= 10) {
                notas[i] = respuesta;
                suma += respuesta;
            } else {
                System.out.println("Nota inválida.");
                notas[i] = 0;
                suma += 0;
            }
        }

        System.out.printf("El promedio es %.2f", suma/cant_notas);
    }
}
