package com.santander.bootcamp;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double total = 0;
        int cantidad_notas = 0;

        while (nota >= 0) {

            System.out.println("Ingrese una nota, -1 para salir");
            nota = scanner.nextDouble();
            if (nota >= 0) {
                total = total + nota;
                cantidad_notas ++;
            }
        }

        double promedio = total / cantidad_notas;
        System.out.printf("El promedio es: %.2f", promedio);

        if (promedio > 7){
            System.out.print("Aprobó");

        } else if (promedio < 4){
            System.out.print("Desaprobó");

        } else {
            System.out.print("A final");
        }

    }

}
