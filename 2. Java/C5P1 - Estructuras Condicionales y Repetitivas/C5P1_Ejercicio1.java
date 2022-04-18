import java.util.Scanner;

public class C5P1_Ejercicio1 {
    public static void main(String[] args) {

        final double fabrica1 =1.07;
        final double fabrica2=1.15;
        final double fabrica3=1.22;
        final double ganancia=1.25;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el precio de costo de la prenda");
        double precioCosto = teclado.nextDouble();

        System.out.println("Ingrese el número de fábrica");
        int numFabrica = teclado.nextInt();
        double precioVenta=0;

        switch (numFabrica) {
            case 1:
                precioVenta=precioCosto*fabrica1;
                break;
            case 2:
                precioVenta=precioCosto*fabrica2;
                break;
            case 3:
                precioVenta=precioCosto*fabrica3;
                break;
        }

        precioVenta= precioVenta * ganancia;
        System.out.printf("El precio de venta de la prenda será: $%.2f", precioVenta);






    }
}
