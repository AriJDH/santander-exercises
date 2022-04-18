import java.util.Scanner;

public class C5P1_Ejercicio3 {

    public static void main(String[] args) {

        final int cantClientes=7;
        final double servicio1=1500;
        final double servicio2=2200;

        Scanner teclado = new Scanner(System.in);



        for(int i=1; i<=cantClientes;i++){
            System.out.println("Ingrese el número de servicio(1 o 2) utilizado por el cliente: " + i );
            int servicio= teclado.nextInt();
            if (servicio == 1)
                System.out.println("El cliente " + i + "pagará: $" + servicio1);
            else
                if (servicio == 2)
                    System.out.println("El cliente " + i + "pagará: $" + servicio2);
                else
                    System.out.println("Ingresó un número de servicio inválido");

        }


    }
}
