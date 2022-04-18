package com.santander.sistema;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nuevo numero");
        String numero = scanner.next();
        System.out.println(numero);
    }
}
