import java.util.Scanner;

public class Ejercicios1 {
    public static void main(String[] args) {
        double precioVenta;
        final double porcentajeFabrica1 = 0.07, porcentajeFabrica2 = 0.15, porcentajeFabrica3 = 0.22, porcentajeGanancia = 0.25;

        Scanner scann = new Scanner(System.in);

        System.out.println("Ingrese el precio de costo del producto");
        double precioCosto = scann.nextDouble();
        System.out.println("Ingrese el número de fábrica donde se compró el producto");
        int numeroFabrica = scann.nextInt();

        switch (numeroFabrica){
            case 1:
                precioVenta = (precioCosto + (precioCosto * porcentajeFabrica1) + (precioCosto + (precioCosto * porcentajeFabrica1) * porcentajeGanancia));
                System.out.println("El precio de venta debe ser de: $" + precioVenta);
                break;
            case 2:
                precioVenta = (precioCosto + (precioCosto * porcentajeFabrica2) + ((precioCosto + (precioCosto * porcentajeFabrica2)) * porcentajeGanancia));
                System.out.println("El precio de venta debe ser de: $" + precioVenta);
                break;
            case 3:
                precioVenta = (precioCosto + (precioCosto * porcentajeFabrica3) + ((precioCosto + (precioCosto * porcentajeFabrica3)) * porcentajeGanancia));
                System.out.println("El precio de venta debe ser de: $" + precioVenta);
                break;
        }

    }
}
