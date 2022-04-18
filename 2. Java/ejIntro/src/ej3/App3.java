package ej3;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        final int PRECIODIA = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese días: ");
        int dias= scanner.nextInt();
        System.out.println("valor de campaña: $"+ dias*PRECIODIA);

    }
}
