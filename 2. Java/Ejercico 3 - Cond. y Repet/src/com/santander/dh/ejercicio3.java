package com.santander.dh;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int servicio1 = 1500;
        int servicio2 = 700;
        int totalServicio;
        int servicio;

        Scanner servicioIngresado = new Scanner (System.in);

        for (int i = 1; i < 8; i++) {

            System.out.println("Ingrese el tipo de factura para el cliente " + i);
            servicio = servicioIngresado.nextInt();

            if (servicio == 1){
                System.out.println("El monto a pagar es :" + servicio1);
            } else if (servicio == 2){
                totalServicio = servicio1 + servicio2;
                System.out.println("El monto a pagar es :" + totalServicio);
            } else{
                System.out.println("El servicio seleccionado es incorreccto");
            }
        }
    }
}
