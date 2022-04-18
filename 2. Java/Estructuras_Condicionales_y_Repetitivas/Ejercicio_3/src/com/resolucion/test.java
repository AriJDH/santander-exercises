package com.resolucion;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int servicio;
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el tipo de servicio (1 o 2)");
            servicio= scanner.nextInt();
            while(servicio<1 || servicio>2){
                System.out.println("Ingrese el tipo de servicio (1 o 2)");
                servicio= scanner.nextInt();
            }
            switch (servicio){
                case 1:
                    System.out.println("El monto a abonar por el cliente "+(i+1)+" es de un total de $"+1500);
                    break;
                case 2:
                    System.out.println("El monto a abonar por el cliente "+(i+1)+" es de un total de $"+(1500+700));
                    break;
            }

        }
    }
}
