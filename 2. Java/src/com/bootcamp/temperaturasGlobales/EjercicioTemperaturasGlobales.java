package com.bootcamp.temperaturasGlobales;

public class EjercicioTemperaturasGlobales {

    public static void main(String[] args) {


        String ciudades [] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "Sao Paulo",
                "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int temperaturas[][] = {{-2, 33}, {-3, 32},{-8, 27},{4, 37}, {6, 42}, {5,43}, {0, 39}, {-7, 26},
                {-1, 31}, {-10, 35}};

        int temperaturaMaxima = 0, temperaturaMinima = 0;
        int indiceTemperaturaMaxima = -1, indiceTemperaturaMinima = -1;

        for (int i = 0; i < ciudades.length; i++) {
            if (i==0){
                temperaturaMaxima = temperaturas[i][1];
                temperaturaMinima = temperaturas[i][0];
            } else {
                if(temperaturaMaxima < temperaturas[i][1]){
                    temperaturaMaxima = temperaturas[i][1];
                    indiceTemperaturaMaxima = i;
                }
                if(temperaturaMinima > temperaturas[i][0]){
                    temperaturaMinima = temperaturas[i][0];
                    indiceTemperaturaMinima = i;
                }
            }
        }
        System.out.println("La ciudad con la mayor temperatura es " + ciudades[indiceTemperaturaMaxima] + " con " + temperaturaMaxima);
        System.out.println("La ciudad con la menor temperatura es " + ciudades[indiceTemperaturaMinima] + " con " + temperaturaMinima);
    }
}
