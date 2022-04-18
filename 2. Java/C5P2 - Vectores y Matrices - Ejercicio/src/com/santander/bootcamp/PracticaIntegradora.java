package com.santander.bootcamp;

public class PracticaIntegradora {

    public static void main(String[] args) {
        String ciudades[] = {"Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio"};


        int temperaturas[][] = { {-2,33}, {-3,32}, {-8,27}, {4,37}, {6,42}, {5,43}, {0,39}, {-7,26}, {-1,31}, {-10,35} };


        int menor_temperatura = temperaturas[0][0];
        int mayor_temperatura = temperaturas[0][1];
        String menor_ciudad = ciudades[0];
        String mayor_ciudad = ciudades[0];

        for (int i = 1; i < ciudades.length; i++) {
            if (menor_temperatura < temperaturas[i][0] ) {
                menor_temperatura = temperaturas[i][0];
                menor_ciudad = ciudades[i];
            }

            if (mayor_temperatura > temperaturas[i][1]) {
                mayor_temperatura = temperaturas[i][1];
                mayor_ciudad = ciudades[i];
            }
        }

        System.out.println("La menor temperatura la tuvo " +menor_ciudad + ", con " + menor_temperatura + "°C.");
        System.out.println("La mayor temperatura la tuvo " +mayor_ciudad + ", con " + mayor_temperatura + "°C.");

        }
    }

