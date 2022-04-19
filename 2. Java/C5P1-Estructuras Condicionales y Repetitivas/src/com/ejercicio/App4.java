package com.ejercicio;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        // Ingresar notas (double) sin listas
        // y calcular el promedio
        int suma = 0;
        int contador = 0;
        double promedio;
        boolean centinela = true;
        while (centinela) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese una nota (0 para terminar): ");
            int nota = scanner.nextInt();
            if (nota == 0) {
                centinela = false;
                promedio = suma / contador;
                System.out.println(promedio);
            }
            suma = suma + nota;
            contador += 1;
        }
    }
}
