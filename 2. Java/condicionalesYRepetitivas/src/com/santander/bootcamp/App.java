package com.santander.bootcamp;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

         double envio_fabrica1 = 0.07;
         double envio_fabrica2 = 0.15;
         double envio_fabrica3 = 0.22;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el costo del producto: ");
        int costo = scanner.nextInt();

        System.out.print("Ingrese la fabrica en que se compró el producto: ");
        int fabrica = scanner.nextInt();

        double costo_con_envio;

        if(fabrica == 1){
            costo_con_envio = costo + costo*envio_fabrica1;
        } else if (fabrica == 2){
            costo_con_envio = costo + costo*envio_fabrica2;
        } else {
            costo_con_envio = costo + costo*envio_fabrica3;
        }

        double precio_venta = costo_con_envio * 1.25;

        System.out.printf("El precio de venta es %.2f", precio_venta);
    }
}
