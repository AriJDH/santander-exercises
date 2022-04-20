import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //Ejercicio
        //ingresar 3 calificaciones
        //Realizar promedio y dependiendo del mismo
        //1-4 recursa
        //4 y 7 aprueba pero va a final
        // 7 - 10 va a final

        Scanner scanner= new Scanner(System.in);
        /*double nota1,nota2,nota3;
        System.out.println("Ingrese 3 notas \n");
        nota1=scanner.nextDouble();
        nota2=scanner.nextDouble();
        nota3=scanner.nextDouble();
        double notaPromedio= (nota1+nota2+nota3)/3;
        if(notaPromedio<4){
            System.out.println("Desaproba2");
        }
        else{
            if(notaPromedio<7){
                System.out.println("Aprobado pero a final");
            }
            else{
                System.out.println("Aprobado y liberado");
            }
        }
        /*
        Otra forma con else if
        if(notaPromedio<4){
            System.out.println("Desaproba2");
        }
        else if(notaPromedio<7){
                System.out.println("Aprobado pero a final");
        }
        else{
                System.out.println("Aprobado y liberado");
        }
        */

        //SWITCHES

        /*
        Consigna
        Reemplazar el ejercicio anterior con switch
         */
        /*
        Long notaPromedioLong= Math.round(notaPromedio);
        int notaPromedioInt=notaPromedioLong.intValue();
        switch (notaPromedioInt){
            case 0:
                System.out.println("Desaproba2");
                break;
            case 1:
                System.out.println("Desaproba2");
                break;
            case 2:
                System.out.println("Desaproba2");
                break;
            case 3:
                System.out.println("Desaproba2");
                break;
            case 4:
                System.out.println("Aproba2 pero al final");
                break;
            case 5:
                System.out.println("Aproba2 pero al final");
                break;
            case 6:
                System.out.println("Aproba2 pero al final");
                break;
            case 7:
                System.out.println("Aproba2");
                break;
            case 8:
                System.out.println("Aproba2");
                break;
            case 9:
                System.out.println("Aproba2");
                break;
            case 10:
                System.out.println("Aproba2");
                break;
        }


         //Estructuras repetitivas

        /*
        Imprimir 10 numeros
         */

        //do while
        /*
        int numeroRepetitivas=0;
        do{
            System.out.println("Numero"+numeroRepetitivas+"\n");
            numeroRepetitivas++;
        }while (numeroRepetitivas<=10);

        //While
        numeroRepetitivas=0;
        while (numeroRepetitivas<=10){
            System.out.println("Numero"+numeroRepetitivas+"\n");
            numeroRepetitivas++;
        }

        //for
        for (int i = 0; i <=10; i++) {
            System.out.println("Numero"+numeroRepetitivas+"\n");

        }


        /*
        Consigna

        Ingresar notas y calcular el promedio y decir que onda

         */
        /*double notaPromedioCiclos=0;

        boolean terminar=false;
        int cont=0;
        int decision;
        while(!terminar){
            cont++;
            System.out.println("Ingrese la nota\t"+cont);
            notaPromedioCiclos=notaPromedioCiclos+scanner.nextDouble();
            System.out.println("Quiere ingresar mas notas? (0 --> no | 1 --> si)\n");
            decision=scanner.nextInt();
            switch (decision){
                case 0:
                    terminar=true;
                    break;
                case 1:
                    terminar=false;
                    break;
                default:
                    terminar=true;
                    System.out.println("Opcion invalida");
                    break;
            }

        }
        System.out.println("La nota promedio es \t"+notaPromedioCiclos/cont);

    /*
    */

        double notasAuxiliar=0;
    System.out.println("Cuantas alumnos desea ingresar? \n");
    int =scanner.nextInt();
        for (int i = 1; i <=3; i++) {
            System.out.println("Ingrese la nota\t"+i);
            notasAuxiliar=notasAuxiliar+scanner.nextDouble();

        }
        double notaPromedio=notasAuxiliar/cantidadNotas;
        System.out.println("La nota promedio es \t"+notaPromedio);
        if(notaPromedio<4){
            System.out.println("Desaproba2");
        }
        else if(notaPromedio<7){
            System.out.println("Aprobado pero a final");
        }
        else{
            System.out.println("Aprobado y liberado");
        }


    }
}
