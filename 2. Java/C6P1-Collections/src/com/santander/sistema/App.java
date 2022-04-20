package com.santander.sistema;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //es mejor cuando quiero agregar y recorrer
        List<String> nombres = new ArrayList();

        nombres.add("Maria");
        nombres.add("Carlos");
        nombres.add("Juan");

        for (int i=0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        for (String nombre: nombres) {
            System.out.println(nombre);
        }

        //Uso de nodos, que facilita su manipulación
        //Si quiero alterar el orden
        //si quiero manipular los datos es mas rápido
        //Método de sobrecargar en clases
        List<String> nombresLink = new LinkedList<>();
        nombresLink.add("n1");
        nombresLink.add("n2");
        nombresLink.add("n3");
        nombres.add(1,"algo");
    }

}
