package com.santander.ejercicios;

public class Main {
    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        ejercicio3(5);
        ejercicio3(8);
    }

    public static void ejercicio1() {
        // Faltan las comillas
        // String apellido = Gomez;
        String apellido = "Gomez";

        // El número no debe estar entre comillas (salvo cuando se requiera un String)
        // int edad = "35";
        int edad = 35;

        // Falta el nombre de la variable
        // boolean = "false";
        boolean unaVariable = false;

        // El valor asignado a sueldo es un double
        // String sueldo = 45857.90
        double sueldo = 45857.90;

        // El valor asignado a nombre es un String
        // double nombre = "Julián";
        String nombre = "Julián";
    }

    public static void ejercicio2() {
        // No puede comenzar con un número
        // String 1nombre;

        int edad;

        // Si bien puede comenzar con $, no es recomendable
        // double $ueldo;

        // No puede comenzar con el símbolo especial "@"
        // String @pellido;

        String direccion;

        boolean licencia_de_conducir;

        // No puede comenzar con el símbolo especial " "
        // double estatura de la persona;

        // No puede comenzar con el símbolo especial "-"
        // int cantidad-de-hijos;
    }

    public static void ejercicio3(int days) {
        int costPerDay = 2;

        System.out.printf("%d días de campaña → $%d * %d = $%d %n", days, costPerDay, days, costPerDay * days);
    }

}
