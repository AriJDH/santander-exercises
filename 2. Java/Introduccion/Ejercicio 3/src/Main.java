import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cantidad de dias");

        int dias= scanner.nextInt();

        int resultado =dias*2;

        System.out.println("Costo total de la campaña: \t"+"$"+resultado);

    }
}
