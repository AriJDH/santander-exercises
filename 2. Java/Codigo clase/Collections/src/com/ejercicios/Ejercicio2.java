package com.ejercicios;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*
        Lista de productos
        Lista de cantidades


         */
        Scanner scanner = new Scanner(System.in);
        List<Integer> cantidades = new ArrayList<>();
        List<String> productos = new ArrayList<>();
        HashMap<String, Integer> mapaRopa = new HashMap<>();
        String productosTeclado;
        int cantidadTeclado;
        System.out.println("INGRESE UN PRODUCTO (para salir ingrese salir)");
        productosTeclado = scanner.next();
        while (!productosTeclado.equalsIgnoreCase("salir")) {
            productos.add(productosTeclado);
            System.out.println("INGRESANDO CANTIDAD DEL PRODUCTO");
            cantidadTeclado = scanner.nextInt();
            cantidades.add(cantidadTeclado);
            System.out.println("INGRESE UN PRODUCTO (para salir ingrese salir)");
            productosTeclado = scanner.next();
        }

        System.out.println("ARMANDO EL MAPA");

        for (int i = 0; i < productos.size(); i++) {
            if(mapaRopa.containsKey(productos.get(i))){
                mapaRopa.put(productos.get(i),mapaRopa.get(productos.get(i))+cantidades.get(i));
            }
            else
                mapaRopa.put(productos.get(i), cantidades.get(i));
        }

        System.out.println("MOSTRANDO EL MAPA");

        for (Map.Entry<String, Integer> ropa : mapaRopa.entrySet()) {
            System.out.println("NOMBRE: "+ropa.getKey()+" CANTIDAD: "+ropa.getValue());

        }


    }
}
