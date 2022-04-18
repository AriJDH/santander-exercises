package com.santander.bootcamp;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int costo_servicio1 = 1500;
        final int costo_servicio2 = 1500+700;

        for (int i = 0; i < 7; i++){
            System.out.printf("Ingrese el servicio contratado por el cliente # %03d: ", i+1);

            int servicio = scanner.nextInt();

            if(servicio == 1){
                System.out.printf("El monto final de la factura del cliente # %03d es de: $" + costo_servicio1+"\n", i+1);
            }
            else if (servicio == 2){
                System.out.printf("El monto final de la factura del cliente # %03d es de: $" + costo_servicio2+"\n", i+1);
            }
        }

    }
}
