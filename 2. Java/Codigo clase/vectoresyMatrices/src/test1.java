import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int cantidadNotas;
        System.out.println("Introduzca la cantidad de notas a ingresar");
        cantidadNotas=scanner.nextInt();
        double notas[]= new double[cantidadNotas];
        int contadorDesaprobada=0;
        int contadorAFinal=0;
        int contadorAprobada=0;
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("Introduzca la "+(i+1)+" nota");
            notas[i]=scanner.nextInt();
            if(notas[i]<4){
                contadorDesaprobada++;
            }
            else if(notas[i]<7){
                contadorAFinal++;
            }
            else{
                contadorAprobada++;
            }
        }
        double notas_desaprobadas[]= new double[contadorDesaprobada];
        double notas_aprobadas[]=new double[contadorAFinal];
        double notas_a_final[]=new double[contadorAprobada];
        for (int i = 0; i < cantidadNotas; i++) {
            if(notas[i]<4){
                notas_desaprobadas[contadorDesaprobada-1]=notas[i];
                contadorDesaprobada--;
            }
            else if(notas[i]<7){
                notas_a_final[contadorAFinal-1]=notas[i];
                contadorAFinal--;
            }
            else{
                notas_aprobadas[contadorAprobada-1]=notas[i];
                contadorAprobada--;
            }
        }
        double promedio=0;
        System.out.println("Promedio de las notas desaprobadas");
        for (int i = 0; i < notas_desaprobadas.length; i++) {
            promedio+=notas_desaprobadas[i];
        }
        System.out.println(promedio/notas_desaprobadas.length);
        System.out.println("Promedio de las notas a final");
        promedio=0;
        for (int i = 0; i < notas_a_final.length; i++) {
            promedio+=notas_a_final[i];
        }
        System.out.println(promedio/notas_a_final.length);
        System.out.println("Promedio de las notas aprobadas");
        promedio=0;
        for (int i = 0; i < notas_aprobadas.length; i++) {
            promedio+=notas_aprobadas[i];
        }
        System.out.println("El promedio de las notas ingresadas es "+promedio/notas_aprobadas.length);
    }
}
