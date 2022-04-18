package com.ejercicio1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class app {
    public static void main(String[] args) {

        final double fabrica1 = 1.07, fabrica2 = 1.15, fabrica3 = 1.22;
        final double ganancia = 1.25;
        double precioPrenda, precioFinal = 0;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatoNumero = new DecimalFormat("#.##");

        System.out.print("Ingrese el valor de la prenda: ");
        precioPrenda = teclado.nextDouble();

        System.out.println("Desde que fabrica lo enviará?\n(1, 2, 3): ");
        int caso = teclado.nextInt();
        if (caso < 1 || caso > 3) {
            do {
                System.out.println("Por favor ingrese una fabrica valida (1, 2, 3): ");
                caso = teclado.nextInt();
            } while (caso < 1 || caso > 3);
        }
        switch (caso){
            case 1:
                precioFinal = precioPrenda * fabrica1 * ganancia;
                break;
            case 2:
                precioFinal = precioPrenda * fabrica2 * ganancia;
                break;
            case 3:
                precioFinal = precioPrenda * fabrica3 * ganancia;
                break;
        }

        System.out.println("El precio a vender de la prenda es: " + formatoNumero.format(precioFinal));

    }
}
