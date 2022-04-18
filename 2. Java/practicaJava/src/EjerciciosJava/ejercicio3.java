package EjerciciosJava;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        int dias, total, precioPorDia = 2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dias: ");
        dias = teclado.nextInt();
        total = precioPorDia * dias;
        System.out.println("El total es: $" + total);
    }

}
