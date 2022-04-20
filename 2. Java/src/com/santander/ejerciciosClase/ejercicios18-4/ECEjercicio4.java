package com.santander.EjerciciosJava2;

import java.util.Scanner;

public class ECEjercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int respA;
        int respB;
        int respC;
        int diarioA=0;
        int diarioB=0;
        int diarioC=0;
        int comAyC=0;
        int comAyB=0;
        int comByC=0;
        for (int i = 1; i <= 2; i++) {
            System.out.println("Cliente N°:"+i);
            System.out.println("¿Se encuentra actualmente subscripto al diario A? [si=1/no=0]");
            respA= teclado.nextInt();
            diarioA+=respA;
            System.out.println("¿Se encuentra actualmente subscripto al diario B? [si=1/no=0]");
            respB= teclado.nextInt();
            diarioB+=respB;
            System.out.println("¿Se encuentra actualmente subscripto al diario C? [si=1/no=0]");
            respC= teclado.nextInt();
            diarioC+=respC;
            if(respA==1&&respC==1){
                comAyC++;
            }
            if(respA==1&&respB==1){
                comAyB++;
            }
            if(respB==1&&respC==1){
                comByC++;
            }
            System.out.println("------------------------------");
        }
        System.out.println("Cantidad de subscriptos a cada Diario son:\nDiario A: "+diarioA+"\nDiario B: "+diarioB+"\nDiario C: "+diarioC);
        System.out.println("-----------------------------------------------------------");
        System.out.println("La cantidad de subscriptos al Diario A y C son: "+comAyC+".");
        System.out.println("La cantidad de subscriptos al Diario A y B son: "+comAyB+".");
        System.out.println("La cantidad de subscriptos al Diario B y C son: "+comByC+".");
        System.out.println("-----------------------------------------------------------");

    }
}
