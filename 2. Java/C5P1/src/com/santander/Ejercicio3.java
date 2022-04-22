package com.santander;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    for (int i = 1;i<8; i++){
        System.out.println("Cliente número: "+ i);
        System.out.println("Ingrese el número de servicio: ");

        int servicio = teclado.nextInt();

        if (servicio ==1){
            System.out.println("El Precio es de $1500 al mes");
        } else if (servicio ==2){
            System.out.println("El precio es de $2200 al mes");
        }



        }
    }

}
