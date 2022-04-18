package com.ej1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int FABRICA1=7;
        final int FABRICA2=15;
        final int FABRICA3=22;
        final int GANACIA=25;
        int costoEnvio=0;
        System.out.print("Ingrese costo del producto: ");
        double costo= teclado.nextDouble();
        System.out.print("Ingrese nro de fabrica: ");
        int nroFabrica= teclado.nextInt();
        if (nroFabrica==1){
            costoEnvio= FABRICA1;
        }else{
            if (nroFabrica==2){
                costoEnvio= FABRICA2;
            }else{
                if (nroFabrica==3){
                    costoEnvio= FABRICA3;
                }
            }
        }
        double costoConEnvio= (costo + (costoEnvio*costo/100));
        double costoFinal= costoConEnvio + (GANACIA*costoConEnvio/100);
        System.out.println("El precio del producto es de: " + costoFinal);
    }
}
