package com.bootcamp.C5P2;

public class Ejercicio_1 {
    public void ejecutar() {
        String[] ciudades = {"Londres","Madrid","Nueva York",
                "Buenos Aires","Asunción","Sao Paulo","Lima",
                "Santiago de Chile","Lisboa","Tokio"};

        int[][] temperaturas = {{-2,33},{-3,32},{-8,27},
                {4,37},{6,42},{5,43},
                {0,39},{-7,26},{-1,31},{-10,35}};

        int INDICE_TEMPERATURA_MAXIMA = 1;
        int INDICE_TEMPERATURA_MINIMA = 0;

        int i_ciudad_temperatura_maxima = 0;
        int i_ciudad_temperatura_minima = 0;

        for (int i_ciudad = 0; i_ciudad < ciudades.length ; i_ciudad++) {
            if (temperaturas[i_ciudad][INDICE_TEMPERATURA_MAXIMA] > temperaturas[i_ciudad_temperatura_maxima][INDICE_TEMPERATURA_MAXIMA]) {
                i_ciudad_temperatura_maxima = i_ciudad;
            } else if (temperaturas[i_ciudad][INDICE_TEMPERATURA_MINIMA] < temperaturas[i_ciudad_temperatura_minima][INDICE_TEMPERATURA_MINIMA]){
                i_ciudad_temperatura_minima = i_ciudad;
            }
        }

        System.out.println("La mayor temperatura la tuvo la ciudad " + ciudades[i_ciudad_temperatura_maxima] + " con " + temperaturas[i_ciudad_temperatura_maxima][INDICE_TEMPERATURA_MAXIMA]);
        System.out.println("La menor temperatura la tuvo la ciudad " + ciudades[i_ciudad_temperatura_minima] + " con " + temperaturas[i_ciudad_temperatura_minima][INDICE_TEMPERATURA_MINIMA]);
    }
}
