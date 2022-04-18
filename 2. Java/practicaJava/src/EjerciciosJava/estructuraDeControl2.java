package EjerciciosJava;

import java.util.Scanner;

public class estructuraDeControl2 {
    public static void main(String[] args){
        int dni, porcentaje;
        double monto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar dni");
        dni = teclado.nextInt();
        System.out.println("Ingresar monto");
        monto = teclado.nextDouble();
        if(monto <= 20000) {
            porcentaje = 20;
        }
        else {
            if(monto > 20000 && monto <= 45000) {
                porcentaje = 10;
            }
            else {
                porcentaje = 5;
            }
        }
        System.out.println("El aumento es de un: " + porcentaje + "%");
    }


}

