package com.Ejercicios.practicos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Declaro variables//

        double valorBrutoPremio;
        double valoroNetoPremio;

        //declaro variables de impuestos con sus respectivos valores
        double primerImpuesto=2.45;
        double segundoImpuesto=15;
        double tercerImpuesto=3;

        //Imprimo mensaje
        System.out.println("Ingrese el monto BRUTO del premio para poder calcular descuentos");

        //Declaro Scanner para que puedan ingresar valor
        Scanner scanner = new Scanner(System.in);
        valorBrutoPremio = scanner.nextDouble();

        //Calcular valor de cada impuesto
        primerImpuesto = (valorBrutoPremio/100) *primerImpuesto;
        segundoImpuesto = (valorBrutoPremio/100) *segundoImpuesto;
        tercerImpuesto = (valorBrutoPremio/100) *tercerImpuesto;

        //declaro variable que pueda restar los descuentos segun el valor ingresado
        valoroNetoPremio = valorBrutoPremio - primerImpuesto - segundoImpuesto - tercerImpuesto;

        //imprimo el valor total neto
        System.out.println("El valor NETO del premio es: $" + valoroNetoPremio);


    }

}
