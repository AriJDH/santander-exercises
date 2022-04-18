package com.santander.EjerciciosJava2;

import java.util.Scanner;

public class ECEjercicio1 {
    public static void main(String[] args) {
        double costo;
        int fabrica;
        double envio=0;
        double pVenta=0;
        final double ganancia = 0.25;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo de la prenda");
        costo= teclado.nextDouble();
        System.out.println("Ingrese la fabrica que confecciona la prenda");
        fabrica= teclado.nextInt();
        switch (fabrica){
            case 1: envio = 0.07;
            break;
            case 2: envio = 0.15;
            break;
            case 3: envio = 0.22;
            break;
            default:
                System.out.println("El numero de fabrica ingresado es incorrecto, no se sumara el costo de envio");
        }
        pVenta=costo+(costo*envio)+(costo+(costo*envio))*ganancia;
        System.out.println("El precio de venta de la prenda es de: $"+(pVenta));
    }
}
