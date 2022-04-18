package EjerciciosJava;

import java.util.Scanner;

public class ejercicioRepaso {

    public static void main(String[] args){
        //consigna 1
        int aux;
        double nota1, nota2, nota3, promedio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar nota 1");
        nota1 = teclado.nextInt();
        System.out.println("Ingresar nota 2");
        nota2 = teclado.nextInt();
        System.out.println("Ingresar nota 3");
        nota3 = teclado.nextInt();
        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio < 4) {
            System.out.println("recursa");
            aux = 0;
        }
        if (promedio < 10) {
            System.out.println("a final");
            aux = 1;
        }
        else {
            System.out.println("promocion");
            aux = 2;
        }
        //consigna 2 condicional con switch

        switch(aux)
        {
            case 0 : System.out.println("recursa");
                break;
            case 1 : System.out.println("a final");
                break;
            case 2 : System.out.println("promocion");
                break;
        }


    }
}
