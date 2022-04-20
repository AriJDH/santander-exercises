package com.ejercicio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();


        nombres.add("Maria");
        nombres.add("Carlos");
        nombres.add("Juan");

        System.out.println(nombres.size());

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        for (String nombre: nombres ) {
            System.out.println(nombre);
        }

        List<String> nombresLink = new LinkedList<>();
        nombresLink.add("n1");
        nombresLink.add("n2");
        nombresLink.add("n3");
        nombresLink.add(3,"otra cosa");




    }

}
