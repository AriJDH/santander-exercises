import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int cantidadNotas;
        System.out.println("Introduzca la cantidad de notas a ingresar");
        cantidadNotas=scanner.nextInt();
        double notas[]= new double[cantidadNotas];
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("Introduzca la "+(i+1)+" nota");
            notas[i]=scanner.nextInt();
        }
        double promedio=0;
        for (int i = 0; i < cantidadNotas; i++) {
            promedio=promedio+notas[i];
        }
        System.out.println("El promedio de las notas ingresadas es "+promedio/cantidadNotas);
    }
}
