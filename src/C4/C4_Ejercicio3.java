package C4;

import java.util.Scanner;

public class C4_Ejercicio3 {

    public static void main(String[] args) {

        final double precio = 2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de días que durará la campaña: ");
        int dias = teclado.nextInt();
        System.out.println("El costo total de la campaña será de: $"+ (precio*dias));
    }

}
