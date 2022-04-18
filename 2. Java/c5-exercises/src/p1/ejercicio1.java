package p1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio de costo: ");
        int cost = input.nextInt();

        System.out.println("Ingrese el número de fábrica: ");
        int fabric = input.nextInt();

        double final_cost = 0;
        switch (fabric) {
            case 1:
                final_cost = cost + cost/100*7;
                break;
            case 2:
                final_cost = cost + cost/100*15;
                break;
            case 3:
                final_cost = cost + cost/100*22;
                break;
            default:
                final_cost = cost;
        }

        final_cost += final_cost/100*25;

        System.out.println("El precio de venta es: $" + final_cost);
    }
}