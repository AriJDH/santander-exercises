package com.ejercicio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        nota_alumnos();
        notas_alumnos1();
    }
    //Consigna
    //Notas de alumnos
    //Ingresar tres notas de calificaciones (double) por teclado
    //Realizar el promedio
    //1-4 recursa
    //entre 4 y 7 va a final
    // mas de 7 promociona

    public static void nota_alumnos() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese Nota1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese Nota2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese Nota3: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3)/3;
        if (promedio<4){
            System.out.println("Recursa");
        }
        else {
            if (promedio > 4 && promedio < 7) {
                System.out.println("Va a final");
            }
            else {
                System.out.println("Promociona");
            }
        }
    }

    //reemplazar estructura condicional (anterior) con Switch
    //usar variable auxiliar

    public static void notas_alumnos1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese Nota1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese Nota2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese Nota3: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3)/3;

        switch ((int)promedio) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Recursar");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("Va a final");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Promociona");
                break;
            default:
                System.out.println("Error!");
        }
    }
}
