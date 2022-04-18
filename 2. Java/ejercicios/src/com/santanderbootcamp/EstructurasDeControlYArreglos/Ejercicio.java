package com.santanderbootcamp.EstructurasDeControlYArreglos;

public class Ejercicio {
    public static void main(String[] args) {
        String ciudades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int temperaturas[][] = {{-2,33},{-3,32},{-8,27},{4,37},{6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};
        String ciudadConMasTemperatura = ciudades[0];
        int temperaturaMasAlta = temperaturas[0][0];
        String ciudadConMenosTemperatura = ciudades[0];
        int temperaturaMasBaja = temperaturas[0][1];
        for(int i = 1; i < ciudades.length; i++) {
            if (temperaturas[i][0] <= temperaturaMasBaja) {
                ciudadConMenosTemperatura = ciudades[i];
                temperaturaMasBaja = temperaturas[i][0];
            }
            if (temperaturas[i][1] >= temperaturaMasAlta) {
                ciudadConMasTemperatura = ciudades[i];
                temperaturaMasAlta = temperaturas[i][1];
            }
        }
        System.out.println("La ciudad que tuvo la temperatura más baja es " + ciudadConMenosTemperatura + " con " + temperaturaMasBaja);
        System.out.println("La ciudad que tuvo la temperatura más alta es " + ciudadConMasTemperatura + " con " + temperaturaMasAlta);
    }
}
