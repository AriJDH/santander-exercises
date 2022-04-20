package com.santander.EjerciciosJava2;

import java.util.Scanner;

public class ECEjercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int servicio1 = 1500;
        int servicio2 = 2200;
        int opcion1;
        int opcion2;
        int opcion3;
        int opcion4;
        int opcion5;
        int opcion6;
        int opcion7;
        int fc=0;

        System.out.println("Ingrese el servicio a facturar: \n1-Seguridad con camaras. \n2-Seguridad con camaras y patrullaje.");
        System.out.println("Cliente 1: ");
        opcion1 = teclado.nextInt();
        System.out.println("Cliente 2: ");
        opcion2 = teclado.nextInt();
        System.out.println("Cliente 3: ");
        opcion3 = teclado.nextInt();
        System.out.println("Cliente 4: ");
        opcion4 = teclado.nextInt();
        System.out.println("Cliente 5: ");
        opcion5 = teclado.nextInt();
        System.out.println("Cliente 6: ");
        opcion6 = teclado.nextInt();
        System.out.println("Cliente 7: ");
        opcion7 = teclado.nextInt();

        System.out.println("Los montos a abonar por cada uno de los clientes son:");
        if(opcion1==1){
            fc=servicio1;
        } else if(opcion1==2) {
            fc=servicio2;
        }
        System.out.println("Cliente N°1: $"+fc);
        if(opcion2==1){
            fc=servicio1;
        } else if(opcion2==2) {
            fc=servicio2;
        }
        System.out.println("Cliente N°2: $"+fc);
        if(opcion3==1){
            fc=servicio1;
        } else if(opcion3==2) {
            fc=servicio2;
        }
        System.out.println("Cliente N°3: $"+fc);
        if(opcion4==1){
            fc=servicio1;
        } else if(opcion4==2) {
            fc=servicio2;
        }
        System.out.println("Cliente N°4: $"+fc);
        if(opcion5==1){
            fc=servicio1;
        } else if(opcion5==2) {
            fc=servicio2;
        }
        System.out.println("Cliente N°5: $"+fc);
        if(opcion6==1){
            fc=servicio1;
        } else if(opcion6==2) {
            fc=servicio2;
        }
        System.out.println("Cliente N°6: $"+fc);
        if(opcion7==1){
            fc=servicio1;
        } else if(opcion7==2) {
            fc=servicio2;
        }
        System.out.println("Cliente N°7: $"+fc);
    }
}
