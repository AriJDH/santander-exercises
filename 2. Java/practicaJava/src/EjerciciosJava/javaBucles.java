package EjerciciosJava;

import java.util.Scanner;

public class javaBucles {
    public static void main(String[] args){
        //consigna 1
        double sumaNotas = 0, promedio, nota;
        int cantidadNotas = -1;
        String a = "";
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Ingresar nota (cero para salir)");
            nota = teclado.nextDouble();
            sumaNotas = sumaNotas + nota;
            cantidadNotas++;
        } while (nota != 0);

        promedio = sumaNotas / cantidadNotas;
        System.out.println("El promedio de las notas es: " + promedio);

    }
}
