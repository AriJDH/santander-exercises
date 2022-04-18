package EjerciciosJava;

import java.util.Scanner;

public class estructuraDeControl3 {
    public static void main(String[] args){
        int servicio;
        Scanner teclado = new Scanner(System.in);
        for (int x=0;x<7; x++) {
            System.out.println("Ingresar servicio (1 o 2) para el cliente: " + (x+1));
            servicio = teclado.nextInt();
            switch(servicio)
            {
                case 1 : System.out.println("cliente " + (x+1) + " posee monto a abonar de $1500");
                    break;
                case 2 : System.out.println("cliente " + (x+1) + " posee monto a abonar de $2200");
                    break;
                default : System.out.println("ingreso mal el servicio");
                    break;
            }
        }
    }
}
