package EjerciciosJava;

import java.util.Scanner;

public class estructuraDeControl {
    public static void main(String[] args){
        double precio, precioVenta = 0;
        int fabrica;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar precio");
        precio = teclado.nextDouble();
        System.out.println("Ingresar frabrica");
        fabrica = teclado.nextInt();
        switch(fabrica)
        {
            case 1 : precioVenta = (precio * 1.07) * 1.25;
                break;
            case 2 : precioVenta = (precio * 1.15) * 1.25;
                break;
            case 3 : precioVenta = (precio * 1.22) * 1.25;
                break;
        }
        System.out.println("El precio de venta es: " + precioVenta);

    }
}
