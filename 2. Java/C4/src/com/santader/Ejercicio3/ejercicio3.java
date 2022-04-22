package com.santader.Ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] arg){

        Scanner Teclado = new Scanner(System.in);

        System.out.println("Número de días de campaña: ");

        int diasCampaña = Teclado.nextInt();

        int montoCampaña = 2 * diasCampaña;

        System.out.println("El monto total es de: $" + montoCampaña);

    }
}
