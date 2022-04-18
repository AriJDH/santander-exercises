package com.bootcamp.EjercicioCondicionales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el costo del producto: ");
        float costo = (float) teclado.nextDouble();

        System.out.println("Ingrese el número de fábrica: ");
        int fabrica = teclado.nextInt();

        float envio = 0;

        if (fabrica == 1){
            envio = 0.07f;
        } else if (fabrica == 2){
            envio = 0.15f;
        } else if (fabrica == 3){
            envio = 0.22f;
        }
        float precioVenta;
        float precioConEnvio = (float) (costo + costo*envio);
        precioVenta =  precioConEnvio + Math.round(precioConEnvio*0.25f);

        System.out.println("El Precio de venta es: $" + precioVenta);

    }
}
