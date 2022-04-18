
package com.santander.dh;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        double precioCostoProducto;
        double precioTotalProducto;
        double precioConImpuesto;
        int numeroDeFabrica;
        int costoEnvioFabrica1 = 7;
        int costoEnvioFabrica2 = 15;
        int costoEnvioFabrica3 = 22;
        int costoGanacia = 25;
        Scanner productoIngresado = new Scanner (System.in);
        Scanner fabricaIngresada = new Scanner (System.in);

        System.out.println("Ingrese el valor del producto");
        precioCostoProducto = productoIngresado.nextDouble();

        System.out.println("Ingrese el número de la fábrica elegida");
        numeroDeFabrica = fabricaIngresada.nextInt();

        if(numeroDeFabrica == 1){
            precioConImpuesto = precioCostoProducto + ((precioCostoProducto * costoEnvioFabrica1)/100);
            precioTotalProducto = precioConImpuesto + ((precioConImpuesto * costoGanacia ) / 100);
            System.out.println("El producto tiene un valor de " + precioCostoProducto + " y será despachado por la fábrica " + numeroDeFabrica + ". El precio total del producto con envío y ganacia es de: " + precioTotalProducto);
        } else if(numeroDeFabrica == 2){
            precioConImpuesto = precioCostoProducto + ((precioCostoProducto * costoEnvioFabrica2)/100);
            precioTotalProducto = precioConImpuesto + ((precioConImpuesto * costoGanacia ) / 100);
            System.out.println("El producto tiene un valor de " + precioCostoProducto + " y será despachado por la fábrica " + numeroDeFabrica + ". El precio total del producto con envío y ganacia es de: " + precioTotalProducto);
        } else if(numeroDeFabrica == 3) {
            precioConImpuesto = precioCostoProducto + ((precioCostoProducto * costoEnvioFabrica3)/100);
            precioTotalProducto = precioConImpuesto + ((precioConImpuesto * costoGanacia ) / 100);
            System.out.println("El producto tiene un valor de " + precioCostoProducto + " y será despachado por la fábrica " + numeroDeFabrica + ". El precio total del producto con envío y ganacia es de: " + precioTotalProducto);
        } else{
            System.out.println("El numero de fábrica ingresado no es valido");
        }
    }
}