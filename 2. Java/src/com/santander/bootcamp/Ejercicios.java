package com.santander.bootcamp;


import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        // EJERCICIO 1

        /*  Un estudiante de programación intentó realizar declaraciones de variables con sus
        respectivos tipos en Java pero tuvo varias dudas mientras lo hacía. A partir de esto, nos
        brindó su código y pidió la ayuda de un desarrollador experimentado que pudiera darle
        una mano. ¿Podrías copiar su código en algún IDE y verificar si es necesario realizar
        correcciones? */

        //String apellido = Gomez; Gomez no es string, necesita comillas
        //int edad = "35"; "35" es una String, tiene que ser int
        //boolean = "false; "false" es String, tiene que ser boolean
        //String sueldo = 45857.90 ---> falta el ";" y el valor asignado tiene que ser String
        //double nombre = "Julián"; ---> el valor asignado es String, tiene que ser double

// -----------------------------------------------------------------

        // EJERCICIO 2

        /* Un profesor de programación está corrigiendo los exámenes de sus estudiantes de la
        materia Programación I para poder brindarles las correspondientes devoluciones. Uno de
        los puntos del examen consistía en proponer nombres de variables, pero uno de los
        alumnos propuso nombres bastante peculiares. ¿Podrías ayudar al profesor a detectar
        cuáles de estos nombres que utilizó el alumno no son correctos? */

        //String 1nombre;
        int edad;
        //double $sueldo;
        //String @pellido;               // Todas las comentadas son incorrectas.
        String direccion;
        boolean licencia_de_conducir;
        //double estatura de la persona;
        //int cantidad-de-hijos;

// --------------------------------------------------------------------

      /* Ejercicio Nº 3
        Un Community Manager desea llevar a cabo una campaña publicitaria para uno de sus
        clientes en Instagram. Para ello, necesita una aplicación que sea capaz de calcular el
        costo total de la campaña a partir de la otorgación de la cantidad de días que dura la misma.
        El precio por día de campaña es de $2 dólares fijos. Realizar un programa que a partir del
        ingreso de la cantidad de días, devuelva por pantalla el monto total*/


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de días que dura la campaña: ");
        int diasCampania = scanner.nextInt();

        System.out.println("El monto total es: " + "$" + diasCampania*2 + " dólares.");

// ---------------------------------------------------------------------

        /* Ejercicio Nº 4
        Un habitante de un pequeño pueblo se enteró por los medios de comunicación que es el
        ganador de la lotería de su país. El premio total es de $23.563.899, sin embargo, a este
        monto se debe aplicar una serie de impuestos para poder otorgar el premio final. Entre
        estos descuentos por impuestos se encuentran:

        ● Impuesto 1 → 2,45% sobre el valor total
        ● Impuesto 2 → 15% sobre el valor total
        ● Impuesto 3 → 3% sobre el valor total

        Realizar un programa que le permita a cualquier ciudadano la posibilidad de ingresar el
        monto en bruto del premio y calcular a partir de él, el monto total que le corresponde
        como premio según los descuentos. Tener en cuenta que todos los porcentajes de
        descuento se calculan SOBRE EL VALOR TOTAL. */

        double impuesto1 =  0.0245;
        double impuesto2 = 0.15;
        double impuesto3 = 0.03;

        System.out.print("Ingrese el monto bruto del premio: ");
        int premioBruto = scanner.nextInt();
        double premioConDescuentos = premioBruto - premioBruto * (impuesto1 + impuesto2 + impuesto3);

        System.out.printf("El monto total que corresponde con los descuentos aplicados es: $ %.2f", premioConDescuentos);

    }
}
