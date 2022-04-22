package com.santander.practica;

public class prueba {
    public static void main(String[] args) {
        DesdeHasta<Integer,Integer> desdeHastaNumero = new DesdeHasta<>(12, 14);
        DesdeHasta<String, String> desdeHastaNombre = new DesdeHasta<>("algo", "otro");
        System.out.println(desdeHastaNumero);
    }
}
