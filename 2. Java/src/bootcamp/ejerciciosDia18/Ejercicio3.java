package bootcamp.ejerciciosDia18;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        double precioCamaras = 1500, precioPatrullaje = 700;
        for (int i = 1; i <= 7; i++) {

            System.out.println("Ingrese el servicio solicitado por el cliente " + i);
            int tipoServicio = scann.nextInt();

            switch (tipoServicio){
                case 1:
                    System.out.println("El cliente " + i + " debe abonar $" + (precioCamaras) + " al mes");
                    break;
                case 2:
                    System.out.println("El cliente " + i + " debe abonar $" + (precioCamaras + precioPatrullaje) + " al mes");
                    break;
            }

        }
    }
}
