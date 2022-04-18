package com.ejercicio3;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        int opcion, precioFinal = 0;
        final int cam = 1500, campat = 2200;
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            System.out.println("\nIngresar el servicio que requiere el cliente " + i +
                    "\n1 - Seguridad de camaras\n2- Seguridad camaras + patrullaje");
            opcion = teclado.nextInt();
            while (opcion != 1 && opcion != 2) {
                System.out.println("\nLe solicitamos que ingrese una opción valida (1, 2): ");
                opcion = teclado.nextInt();
            }

            if (opcion == 1) {
                precioFinal += cam;
                System.out.println("El monto a abonar por el cliente " + i + "es de: " + cam);
            }
            else {
                precioFinal += campat;
                System.out.println("El monto a abonar por el cliente " + i + "es de: " + campat);
            }
        }

        System.out.println("\n\nEl monto total generado es de: " + precioFinal);
    }
}
