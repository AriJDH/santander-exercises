package com.ejercicio2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class app {
    public static void main(String[] args) {

        double sueldo, sueldoAumentado = 0;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatoNumero = new DecimalFormat("#.##");

        System.out.print("Ingrese el sueldo del empleado: ");
        sueldo = teclado.nextDouble();

        if (sueldo <= 20000){ sueldoAumentado = sueldo * 1.2; }
        else if (sueldo <= 45000) { sueldoAumentado = sueldo * 1.1; }
        else if (sueldo > 45000) { sueldoAumentado = sueldo * 1.05; }

        System.out.println("El nuevo sueldo es: " + formatoNumero.format(sueldoAumentado));

    }
}
