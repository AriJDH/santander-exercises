package com;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner costo = new Scanner(System.in);
        System.out.println("Ingresar el costo de la mercaderia: ");
        int precioCosto = costo.nextInt();
        System.out.println("Ingresar el numero de fabrica al que compramos: ");
        int fabrica = costo.nextInt();
        float ganancia = 0.25f;
        float precioTotal = 0;
        float envio1 = 0.07f;
        float envio2 = 0.15f;
        float envio3 = 0.22f;

        if(fabrica == 1){
            precioTotal = ((precioCosto*(1+envio1))*(1+ganancia));

        }else if(fabrica == 2){
            precioTotal = ((precioCosto*(1+envio2))*(1+ganancia));
        }else if(fabrica == 3){
            precioTotal = ((precioCosto*(1+envio3))*(1+ganancia));
        }else{
            System.out.println("El numero de fabrica todavia no está seteado");
        }
        System.out.println("El costo total es de: $"+ precioTotal);

    }


}