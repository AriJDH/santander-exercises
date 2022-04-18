import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaracion de variables
        double fabricaUnoCostoenvio= 1.07;
        double fabricaDosCostoenvio= 1.15;
        double fabricaTresCostoenvio= 1.22;
        //constante
        final double ganancia = 1.25;
        //precio venta = costo + costo de envio

        System.out.println("Indique para que fabrica desea conocer el precio de venta ");
        int fabrica= entrada.nextInt();
        System.out.println("Indique el costo del producto");
        int costo= entrada.nextInt();


        switch (fabrica){
            case 1:
                double precioVenta= costo*fabricaUnoCostoenvio*ganancia;
                System.out.println(precioVenta);
                break;
            case 2:
                double precioVenta2= costo*fabricaDosCostoenvio*ganancia;
                System.out.println(precioVenta2);
                break;
            case 3:
                double precioVenta3= costo*fabricaTresCostoenvio*ganancia;
                System.out.println(precioVenta3);
                break;



        }











    }
}

