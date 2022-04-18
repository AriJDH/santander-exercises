package com.ejercicio;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double promedio;
        System.out.print("Ingrese la primer nota: ");
        nota1 = teclado.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.print("Ingrese la tercer nota: ");
        nota3 = teclado.nextDouble();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.printf("La nota es: %.2f\n", promedio);
        switch ((int)promedio) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Recursa");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Va a final");
                break;
            default:
                System.out.println("Promociona");
        }

    }
}
