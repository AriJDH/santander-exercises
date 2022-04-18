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
        //ejercicio 4
        //declaracion variables
        int diarioA =0;
        int diarioB =0;
        int diarioC =0;
        int diarioAyB= 0;
        int diarioAyC= 0;
        int diarioByC= 0;
        int cliente= 50;
        int todos= 0;
        while(cliente>0){
            System.out.println("A cuantos diarios está suscrito? 1.A 2.B 3.C 4.AyB 5.AyC 6.ByC 7.todos");
            int seleccion= entrada.nextInt();
            switch (seleccion) {
                case 1:
                    diarioA++;
                    break;
                case 2:
                    diarioB++;
                    break;
                case 3:
                    diarioC++;
                    break;
                case 4:
                    diarioAyB++;
                    break;
                case 5:
                    diarioAyC++;
                    break;
                case 6:
                    diarioByC++;
                    break;
                case 7:
                    todos++;
                    break;

            }
            cliente--;


        }



        System.out.println("a los 3 diarios están suscritos: " + todos);
        System.out.println("al diario A y C están suscritos " +diarioAyC);
        System.out.println("al diario A y B están suscritos " + diarioAyB);
        System.out.println("al diario B y C están suscritos "+ diarioByC);
        System.out.println("al diario A están suscritos " + diarioA);








    }
}

