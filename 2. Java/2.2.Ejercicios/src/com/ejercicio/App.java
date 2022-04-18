package com.ejercicio;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //
        // Consigna
        // cargar una lista de notas
        // y obtener el promedio de notas
        // Crear 3 listas con las notas
        // a final, aprobados y desaprobados
        //

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas: ");
        int cantNotas = input.nextInt();
        int notas[] = new int[cantNotas];
        for (int i=0; i<cantNotas; ++i) {
            System.out.println("Ingrese una nota: ");
            notas[i] = input.nextInt();
        }
        int sum=0;
        for (int i=0; i<cantNotas; ++i) {
            sum += notas[i];
        }
        double promedio = sum/cantNotas;
        System.out.println("Promedio: " +promedio);





    }

}
