package com.primerProyecto;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner awards = new Scanner(System.in);
        System.out.println("Ingresar el importe del premio ganado: ");
        int reward = awards.nextInt();

        float tax1 = 0.0245f;
        float tax2 = 0.15f;
        float tax3 = 0.03f;
        float total = (reward - (reward * (tax1+tax2+tax3)));
        System.out.println("El importe a recibir despues de impuestos es de: " + total);

    }
}
