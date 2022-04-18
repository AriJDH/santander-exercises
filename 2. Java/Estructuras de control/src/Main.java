import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaracion de variables
        double fabricaUnoCostoenvio = 1.07;
        double fabricaDosCostoenvio = 1.15;
        double fabricaTresCostoenvio = 1.22;
        //constante
        final double ganancia = 1.25;
        //precio venta = costo + costo de envio

        System.out.println("Indique para que fabrica desea conocer el precio de venta ");
        int fabrica = entrada.nextInt();
        System.out.println("Indique el costo del producto");
        int costo = entrada.nextInt();


        switch (fabrica) {
            case 1:
                double precioVenta = costo * fabricaUnoCostoenvio * ganancia;
                System.out.println(precioVenta);
                break;
            case 2:
                double precioVenta2 = costo * fabricaDosCostoenvio * ganancia;
                System.out.println(precioVenta2);
                break;
            case 3:
                double precioVenta3 = costo * fabricaTresCostoenvio * ganancia;
                System.out.println(precioVenta3);
                break;


        }

        //Segundo ejercicio
        //declaracion de variables

        System.out.println("por favor ingrese su sueldo para calcular el aumento");
        double sueldo = entrada.nextDouble();
        if (sueldo <= 20000) {
            double sueldoFinal = sueldo * 1.20;
            System.out.println(sueldoFinal);

        } else if (sueldo > 20000 && sueldo <= 45000) {
            double sueldoFinal = sueldo * 1.10;
            System.out.println(sueldoFinal);


        } else {
            double sueldoFinal = sueldo * 1.05;
            System.out.println(sueldoFinal);
        }

        //tercer ejercicio
         //declaracion variables
        int servicioCamaras = 1500;
        int servicioCamarasYPatrullaje= servicioCamaras + 700;

        for(int i=0; i<7; i++){
            System.out.println("De que servicio desea calcular? 1.Servicio de camaras 2. Servicio de camaras " +
                    "+ patrullaje");
            int servicio = entrada.nextInt();
            if(servicio == 1){
                int precioFinal= servicioCamaras;
                System.out.println(precioFinal);
            }else if(servicio == 2){
                int precioFinal= servicioCamarasYPatrullaje ;
                System.out.println(precioFinal);
            }else{
                System.out.println("Servicio inexistente");
            }


        }










    }
}

