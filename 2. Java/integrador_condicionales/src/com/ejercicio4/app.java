package com.ejercicio4;
import java.util.Scanner;


public class app {
    public static void main(String[] args) {

        int tresDiarios = 0, diariosAC = 0, diariosAB = 0, diariosBC = 0, diarioA = 0;
        boolean op1 = false, op2 = false, op3 = false;
        char op;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de clientes: ");
        int cantClientes = teclado.nextInt();

        for (int i = 1; i <= cantClientes; i++){
            System.out.println("\nCliente " + i);
            System.out.print("Está suscripto al diario A? (s/n): ");
            op = teclado.next().charAt(0);
            if (op == 's'){op1 = true;}
            op = ' ';

            System.out.print("Está suscripto al diario B? (s/n): ");
            op = teclado.next().charAt(0);
            if (op == 's'){op2= true;}
            op = ' ';

            System.out.print("Está suscripto al diario C? (s/n): ");
            op = teclado.next().charAt(0);
            if (op == 's'){op3 = true;}
            op = ' ';

            if (op1 && !op2 && !op3) { diarioA ++; }
            else if (op1 && op2 && !op3) { diariosAB ++; }
            else if (op1 && !op2 && op3) { diariosAC ++; }
            else if (!op1 && op2 && op3) { diariosBC ++; }
            else if (op1 && op2 && op3) { tresDiarios ++; }

            op1 = false;
            op2 = false;
            op3 = false;
        }

        System.out.println("\n");
        System.out.println(tresDiarios + " personas estan suscriptas a los 3 diarios");
        System.out.println(diariosAC + " personas están suscriptas a los diarios A y C");
        System.out.println(diariosAB + " personas están suscriptas a los diarios A y B");
        System.out.println(diariosBC + " personas están suscriptas a los diarios B y C");
        System.out.println(diarioA + " personas están suscriptas solamente al diario A");
    }
}
