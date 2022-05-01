import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("Ingresar precio de lista");
        Scanner scanner = new Scanner(System.in);
        double precioLista = scanner.nextDouble();


        double fabricaUno = precioLista + (precioLista * 0.07) * 0.25;
        System.out.println("Precio estimado del producto en fabrica uno: $" + fabricaUno);
        double fabricaDos = precioLista + (precioLista * 0.15) * 0.25;
        System.out.println("Precio estimado del producto en fabrica dos: $" + fabricaDos);
        double fabricaTres = precioLista + (precioLista * 0.22) * 0.25;
        System.out.println("Precio estimado del producto en fabrica tres: $" + fabricaTres);

    }
}
