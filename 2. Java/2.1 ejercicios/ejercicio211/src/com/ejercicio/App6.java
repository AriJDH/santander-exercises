package com.ejercicio;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double notaPromedioCiclos=0;
        boolean terminar=false;
        int cont=0;
        int decision;
        while(!terminar){
            cont++;
            System.out.println("Ingrese la nota\t"+cont);
            notaPromedioCiclos=notaPromedioCiclos+scanner.nextDouble();
            System.out.println("Quiere ingresar mas notas? (0 --> no | 1 --> si)\n");
            decision=scanner.nextInt();
            switch (decision){
                case 0:
                    terminar=true;
                    break;
                case 1:
                    terminar=false;
                    break;
                default:
                    terminar=true;
                    System.out.println("Opcion invalida");
                    break;

            }

        }
        System.out.println("La nota promedio es \t"+notaPromedioCiclos/cont);


    }
}
