package com.resolucion;

import java.util.Scanner;

public class testConVectorFijo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ciudades[] = {"Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio",
        };
        double temperaturas[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};


        double temperaturaMaxima = 0, temperaturaMinima = 0;
        String ciudadTemperaturaMinima = "", ciudadTemperaturaMaxima = "";
        for (int i = 0; i < ciudades.length; i++) {
            if (temperaturas[i][0] < temperaturaMinima) {
                temperaturaMinima = temperaturas[i][0];
                ciudadTemperaturaMinima = ciudades[i];
            }
            if (temperaturas[i][1] > temperaturaMaxima) {
                temperaturaMaxima = temperaturas[i][1];
                ciudadTemperaturaMaxima = ciudades[i];
            }

        }
        System.out.println("La ciudad de " + ciudadTemperaturaMinima + " fue la ciudad mas fria con temperaturas minimas de " + temperaturaMinima);
        System.out.println("La ciudad de " + ciudadTemperaturaMaxima + " fue la ciudad mas calurosa con temperaturas maximas de " + temperaturaMaxima);
    }
}
