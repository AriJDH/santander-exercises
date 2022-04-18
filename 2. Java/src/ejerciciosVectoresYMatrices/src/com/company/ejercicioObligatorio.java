package com.company;

public class ejercicioObligatorio {
    public static void main(String[] args) {
        String ciudades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "Sao Paulo", "Lima", "Santiago de Chile", "Lisboa", "Toko"};
        int temperaturas[][] = {{-2, 33},{-3,32},{-8,27},{4,37},{6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};
        int menorTemp = temperaturas[0][0];
        int mayorTemp = temperaturas[0][1];
        String ciudadMenorTemp = ciudades[0];
        String ciudadMayorTemp = ciudades[0];
        for (int f=0;f<ciudades.length;f++) {
            if (temperaturas[f][0] < menorTemp) {
                menorTemp = temperaturas[f][0];
                ciudadMenorTemp = ciudades[f];
            }
            if (temperaturas[f][1] > mayorTemp) {
                mayorTemp = temperaturas[f][1];
                ciudadMayorTemp = ciudades[f];
            }
        }
        System.out.println("La ciudad con mayor temperatura registrada es " + ciudadMayorTemp + ", con una temperatura de " + mayorTemp + "°C." +
        "\nLa ciudad con menor temperatura es " + ciudadMenorTemp + ", con una temperatura de " + menorTemp + "°C.");
    }
}
