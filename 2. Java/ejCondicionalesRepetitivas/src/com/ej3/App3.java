package com.ej3;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        final int CLIENTES=7;
        final int CAMARAS=1500;
        final int PATRULLAJE=700;
        Scanner teclado = new Scanner(System.in);
        for(int i=0;i<CLIENTES;i++){
            System.out.println("Ingrese servicio: 1. Servicio 1     2. Servicio 2");
            int tipo= teclado.nextInt();
            if (tipo==1){
                System.out.println("debe abonar $"+ CAMARAS);
            }else{
                if (tipo==2){
                    System.out.println("debe abonar $"+ (CAMARAS+PATRULLAJE));
                }
            }
        }

    }

}
