package com.bootcamp.C8P1.practica;

import java.util.List;

public class Distribuidora {
    List<Producto> productos;
    int contador_perecederos;
    int contador_no_perecederos;
    double acum_perecederos;
    double acum_no_perecederos;

    private final int LIMITE = 5;

    public Distribuidora(List<Producto> productos) {
        this.productos = productos;
    }

    public void vender(String nombre_producto, int cantidad){
        boolean encontro = false;
        int i = 0;
        Producto producto = null;
        while(!encontro){
            producto = productos.get(i);
            encontro = producto.getNombre().equals(nombre_producto);
            i++;
        }

        if(encontro){
            contador_perecederos = producto.aumentar_si_perecedero(contador_perecederos);
            acum_perecederos = producto.acumular_si_perecedero(acum_perecederos, cantidad);

            contador_no_perecederos = producto.aumentar_si_no_perecedero(contador_no_perecederos);
            acum_no_perecederos = producto.acumular_si_no_perecedero(acum_no_perecederos, cantidad);

            imprimir_total_si_llego_a_5();
        }
    }

    private void imprimir_total_si_llego_a_5() {
        if (contador_no_perecederos == LIMITE && contador_perecederos == LIMITE){
            System.out.println("Se vendio" + LIMITE + "de cada uno");
            System.out.println("Total perecederos: " + acum_perecederos);
            System.out.println("Total no perecederos: " + acum_no_perecederos);
            System.out.println("Total: " + (acum_perecederos + acum_no_perecederos));

            acum_perecederos = 0;
            acum_no_perecederos = 0;
            contador_no_perecederos = 0;
            contador_perecederos = 0;
        }
    }


}
