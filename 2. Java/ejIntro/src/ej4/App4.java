package ej4;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        final double IMP1 = 2.45, IMP2=15,IMP3=3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese premio bruto: ");
        double premioBruto= scanner.nextDouble();
        double precioNeto= premioBruto - (premioBruto/100*IMP1) - (premioBruto/100*IMP2) - (premioBruto/100*IMP3);
        System.out.println(precioNeto);
    }
}
