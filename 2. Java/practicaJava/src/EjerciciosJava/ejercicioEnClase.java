package EjerciciosJava;

import java.util.Scanner;

public class ejercicioEnClase {

    public static void main(String[] args) {
        //Ejercicio 3
        String alumnos[] = {"Carlos", "Maria", "Juan", "Pedro"};
        int notas[][] = {{4,5,6},{8,9,10},{9,9,10},{8,5,10}};
        double notaAlumno;
        for(int x = 0; x < 4; x++) {
            notaAlumno = 0;
            for(int y = 0; y < 3; y++) {
                notaAlumno += notas[x][y];
            }
            System.out.printf(alumnos[x] + " su promedio es: " + notaAlumno / 3 + "\n");
        }


        /* Ejercicio2
        Scanner teclado = new Scanner(System.in);
        int cantidadDeNotas, a=0, d=0, p=0;
        System.out.println("ingrese cantidad de notas");
        cantidadDeNotas = teclado.nextInt();
        int notas[] = new int[cantidadDeNotas];
        int aprobados[] = new int[cantidadDeNotas];
        int desaprobados[] = new int[cantidadDeNotas];
        int promocionan[] = new int[cantidadDeNotas];
        for (int x = 0; x < cantidadDeNotas; x++) {
            System.out.println("ingrese nota ");
            notas[x] = teclado.nextInt();
            if(notas[x]<4){
                desaprobados[d]=notas[x];
                d++;
            }
            else if(notas[x]<=7){
                    aprobados[a]=notas[x];
                    a++;
                }
                else {
                    promocionan[p]=notas[x];
                    p++;
                }

        }

        System.out.println("Los aprobados son: ");
        for (int x = 0; x < a; x++) {
            System.out.println(aprobados[x]);
        }
        System.out.println("Los desaprobados son: ");
        for (int x = 0; x < d; x++) {
            System.out.println(desaprobados[x]);
        }
        System.out.println("Los que promocionan son: ");
        for (int x = 0; x < p; x++) {
            System.out.println(promocionan[x]);
        }*/





        /* Ejercicio1
        Scanner teclado = new Scanner(System.in);
        int cantidadDeNotas, total = 0;
        System.out.println("ingrese cantidad de notas");
        cantidadDeNotas = teclado.nextInt();
        int notas[] = new int[cantidadDeNotas];
        for (int x = 0; x < cantidadDeNotas; x++) {
            System.out.println("ingrese nota ");
            notas[x] = teclado.nextInt();
        }
        for (int y=0;y<cantidadDeNotas;y++) {
            total = total + notas[y];
        }
        System.out.println("El promedio es: " + total/cantidadDeNotas);*/


    }

}
