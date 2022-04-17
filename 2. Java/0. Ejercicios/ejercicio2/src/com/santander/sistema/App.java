package com.santander.sistema;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero:");
        int numero = scanner.nextInt();
        System.out.println("El numero ingresado es " + numero);

        System.out.print("Ingrese un nombre");
        String nombre = scanner.next();
        System.out.println("El nombre ingresado es " + nombre);

        System.out.print("Ingrese otro numero ");
        double otroNumero = scanner.nextDouble();
        System.out.println("Otro numero ingresado " + otroNumero );

        scanner.close();

        /*
        System.out.println("Hola mundo");
        short unNumero = 32000;
        int numero;
        double otroNumero = 23545.235;
        float fNumero = 235.535F;
        char letra = 'b';
        boolean bandera = true;
        String unaFrase = "Esto es una frase";
        numero = 234;
        // int 2numero = 10;
        // int *algo = 10;
        // int nu mero = 10;
        // int for = 20;

        // operadores
        int a = 100;
        int b = 500;
        // System.out.println(a != b);

        boolean b1 = false;
        boolean b2 = true;
        System.out.println(b1 && b2);
        System.out.println(b1 || b2);
        */




    }

}
