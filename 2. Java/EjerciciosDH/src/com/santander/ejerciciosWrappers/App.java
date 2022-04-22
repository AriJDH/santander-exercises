package com.santander.ejerciciosWrappers;

public class App {
    public static void main(String[] args) {
        DesdeHasta<Integer, Integer> desdeHastaNumer = new DesdeHasta<>();

        desdeHastaNumer.setDesde(12);
        desdeHastaNumer.setHasta(13);

        //Informe...

        DesdeHasta<String, String> desdeHastaNombre = new DesdeHasta<>();

        desdeHastaNombre.setDesde("algo");
        desdeHastaNombre.setHasta("otro");

        System.out.println(desdeHastaNombre);

    }
}
