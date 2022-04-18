package com.ej1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese limite de ciudades a ingresar: ");
        int limite = teclado.nextInt();
        String ciudades[] = new String[limite];

        for (int i = 0; i < ciudades.length; i++) {
            System.out.print("ciudad: ");
            ciudades[i] = teclado.next();
        }

        int temps[][] = new int[limite][2];

        for (int i = 0; i < temps.length; i++) {
            System.out.print("ingrese mínima temp de " + ciudades[i] + ":");
            temps[i][0] = teclado.nextInt();
            System.out.print("ingrese máxima temp de " + ciudades[i] + ":");
            temps[i][1] = teclado.nextInt();
        }

        //una vez cargado..

        int tempMin = temps[0][0];
        int tempMax = temps[0][1];
        String ciudadMinima = ciudades[0];
        String ciudadMaxima = ciudades[0];

        for (int i = 0; i < limite; i++) {
            if (temps[i][0] < tempMin) {
                tempMin = temps[i][0];
                ciudadMinima = ciudades[i];
            }
            if (temps[i][1] > tempMax) {
                tempMax = temps[i][1];
                ciudadMaxima = ciudades[i];
            }
        }

        System.out.println("la ciudad con temp min de " + tempMin + "° es " + ciudadMinima);
        System.out.println("la ciudad con temp max de " + tempMax + "° es " + ciudadMaxima);
    }

}
