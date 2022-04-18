import java.util.Scanner;

public class Practica2 {
    public void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notas = 0;
        int cantidadDeNotas;
        double promedio;
        System.out.print("Ingrese la cantidad de notas: ");
        cantidadDeNotas = teclado.nextInt();
        for (int i = 0; i < cantidadDeNotas; i++) {
            System.out.print("Ingrese la nota número " + (i + 1) + ": ");
            notas += teclado.nextDouble();
        }
        promedio = notas / cantidadDeNotas;
        System.out.printf("El promedio es %.2f", promedio);
    }
}
