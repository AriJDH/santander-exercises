package com.bootcamp.EjercicioTemperaturas;

public class Temperaturas {

    public static void main(String[] args) {

        String [] Capitales= {"Londres","Madrid","Nueva York","Buenos Aires","Asunción","Sao Paulo","Lima","Santiago de Chile","Lisboa", "Tokio"};
        int[][] Temps = {{-2,33},{-3,32},{-8,27},{4,37},{6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};

        int max = 0;
        int min = 0;
        String Paismin = "";
        String Paismax = "";

        for (int f = 0; f<Capitales.length;f++){

            if (Temps[f][0] < min){
                min = Temps[f][0];
                Paismin = Capitales[f];
            }else if (Temps[f][1]>max){
                max = Temps[f][1];
                Paismax = Capitales[f];
            }

            }

        System.out.println("El lugar con temperatura mas baja es "+Paismin + " con una temperatura de "+min+"°C"+"\nEl lugar con temperatura más alta es "+Paismax+" con una temperatura de "+max+"°C");
        }
}

