package com.santander.estructurasControl;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int cantidadEncuestados = 50;
        int contadorTresDiarios=0;
        int contadorA=0;
        int contadorAB=0;
        int contadorBC=0;
        int contadorAC=0;

        for (int i = 0; i < cantidadEncuestados; i++) {
            int opcion;
            System.out.println("¿Estas suscripto a los 3 diarios? (1-Si 2-No");
            opcion = entrada.nextInt();
           if(opcion==1){
               contadorTresDiarios++;
           }else{
               System.out.println("¿Estas suscripto solo al diario A? (1-Si 2-No");
               opcion= entrada.nextInt();
               if (opcion==1){
                   contadorA++;

               }else{
                   System.out.println("¿Estas suscripto al diario A y B? (1-Si 2-No");
                   opcion= entrada.nextInt();
                   if (opcion==1){
                       contadorAB++;
                   }else{
                       System.out.println("¿Estas suscripto al diario  B y C? (1-Si 2-No");
                       opcion= entrada.nextInt();
                       if (opcion==1){
                           contadorBC++;
                       }else{
                           System.out.println("¿Estas suscripto al diario  A y C? (1-Si 2-No");
                           opcion= entrada.nextInt();
                           if (opcion==1){
                               contadorAC++;
                           }
                       }
                   }
               }
           }
        }
        System.out.println("suscriptos a los 3 diarios " + contadorTresDiarios);
        System.out.println("suscriptos solo al diario A " + contadorA);
        System.out.println("suscriptos  al diario AB " + contadorAB);
        System.out.println("suscriptos  al diario BC " + contadorBC);
        System.out.println("suscriptos  al diario BC " + contadorAC);

    }
}
