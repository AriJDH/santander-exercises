package com.santander.vectores;

public class EjercicioArrayTridimensional {
    public static void main(String[] args) {
        String nombreCiudades[] = {"Londres","Madrid","Nueva York","Buenos Aires","Asunción",
                "São Paulo","Lima","Santiago de Chile","Lisboa","Tokio"};
        int temperaturas[][]={{-2,33},{-3,32},{-8,27},{4,37},{6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};
        int menorTemperatura=0;
        int mayorTemperatura=0;
        int indiceMayor=0;
        int indiceMenor=0;
        for (int f = 0; f <temperaturas.length ; f++) {

                if(menorTemperatura>temperaturas[f][0]){
                    menorTemperatura=temperaturas[f][0];
                    indiceMenor=f;
                }
                if(mayorTemperatura<temperaturas[f][1]){
                    mayorTemperatura=temperaturas[f][1];
                    indiceMayor=f;
                }

        }
        System.out.println("la mayor temperatura fue de: "+nombreCiudades[indiceMayor]+" la cual fue de: " + temperaturas[indiceMayor][1]);
        System.out.println("la menor temperatura fue de: "+nombreCiudades[indiceMenor]+" la cual fue de: " + temperaturas[indiceMenor][0]);

    }
}
