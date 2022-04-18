package com.santander.bootcamp;

public class Main {
    public static void main(String[] args) {
        String[] ciudades = {
                "Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción",
                "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"
        };

        int[][] temperaturas = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        String ciudad_minima = ciudades[0];
        int temperatura_minima = temperaturas[0][0];
        String ciudad_maxima = ciudades[0];
        int temperatura_maxima = temperaturas[0][1];

        for (int x = 0; x < ciudades.length; x++) {
            if (temperaturas[x][0] < temperatura_minima) {
                temperatura_minima = temperaturas[x][0];
                ciudad_minima = ciudades[x];
            }

            if (temperaturas[x][1] > temperatura_maxima) {
                temperatura_maxima = temperaturas[x][1];
                ciudad_maxima = ciudades[x];
            }
        }

        System.out.printf("%nCiudad con menor temperatura: %s (%d°C)", ciudad_minima, temperatura_minima);
        System.out.printf("%nCiudad con mayor temperatura: %s (%d°C)", ciudad_maxima, temperatura_maxima);
    }
}
