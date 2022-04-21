import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
       /*
        System.out.println("Ingrese la primer nota");
        final double primerNota = scann.nextDouble();
        System.out.println("Ingrese la segunda nota");
        final double segundaNota = scann.nextDouble();
        System.out.println("Ingrese la tercer nota");
        final double tercerNota = scann.nextDouble();

        double promedio = (primerNota + segundaNota + tercerNota) / 3;

        if (promedio <= 4){
            System.out.println("Recursante");
        }else if (promedio <= 7){
            System.out.println("Regular");
        }else {
            System.out.println("Promocion");
        }


        int numero = 3;
        do {
            System.out.println("asd" + numero);
            numero++;
        } while (numero < 3);

        numero = 3;

        while (numero < 3){
            System.out.println(numero);
            numero++;
        }
        */
        boolean masNotas = true;
        double sumaNotas = 0;
        int cantidadNotas = 0;
        do {
            System.out.println("Ingresar nota");
            sumaNotas = sumaNotas + scann.nextDouble();
            cantidadNotas++;
            System.out.println("¿Desea ingresar otra nota? 1. Si; 2. No");
            if (scann.nextInt() == 2){
                masNotas = false;
            }
        }while(masNotas);

        double promedio = sumaNotas / cantidadNotas;
        System.out.println("El promedio de las notas es: " + promedio);

        if(promedio < 4) {
            System.out.println("Condicion: desaprobado");
        } else if (promedio < 7){
            System.out.println("Condicion: regular");
        } else{
            System.out.println("Condicion: aprobado");
        }
    }
}
