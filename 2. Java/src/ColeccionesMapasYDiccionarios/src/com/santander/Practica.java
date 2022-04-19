package com.santander;

import java.util.*;

public class Practica {
    public static void main(String[] args) {
        segundoEjercicio();
    }

    public static void practica() {
        //Array List
        List<String> nombres = new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Mariano");
        nombres.add("Julian");

        //Iterando por elemento
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        //Iterando por posición
        for (int i=0;i<nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        //Linked List
        List<String> nombresLinked = new LinkedList<>();
        nombres.add("Leandro");
        nombres.add("Micaela");
        nombres.add("Ariel");
        nombres.add(1,"Andrés");

        for (String nom : nombresLinked) {
            System.out.println(nom);
        }

        //Hash map:
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Leon");
        mapa.put(2, "Cebra");
        mapa.put(3, "Canguro");
        String primerAnimal = mapa.get(1);
        System.out.println(primerAnimal);

        for (Map.Entry<Integer, String> entrada : mapa.entrySet()){
            Integer clave = entrada.getKey();
            String animal = entrada.getValue();
            System.out.println("La clave es: " + clave + " y el animal es: " + animal);
        }
        mapa.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
    }
    public static void ejercicioListas() {
        //Tomar por teclado lista de notas (int), lista de alumnos y lista de alumnos aprobados.
        Scanner teclado = new Scanner(System.in);
        boolean next = true;
        List<String> alumnos = new ArrayList<>();
        List<Integer> notas = new ArrayList();
        do {
            System.out.println("Ingrese el nombre del alumno: ");
            alumnos.add(teclado.next());
            System.out.println("Ingrese la nota del alumno: ");
            notas.add(teclado.nextInt());
            System.out.println("¿Desea seguir cargando? Sí -> 1, No -> 2");
            if (teclado.nextInt() == 2) {
                next = false;
            }
        } while (next == true);
        List<String> promocionados = new LinkedList();
        for(int i=0; i<notas.size(); i++) {
            if(notas.get(i) >= 7){
                promocionados.add(alumnos.get(i));
            }
        }
        System.out.println("Los promocionados son: ");
        for(int i=0;i< promocionados.size();i++) {
            System.out.println(promocionados.get(i));
        }
    }
    public static void segundoEjercicio() {
        //lista con elementos repetidos, unificar a diccionario
        Scanner teclado = new Scanner(System.in);
        List<String> ropa = new ArrayList<>();
        HashMap<String, Integer> ropaPorProd = new HashMap<>();
        while(true) {
            System.out.println("Ingrese un producto (salir para finalizar): ");
            String producto = teclado.next();
            if (producto.equalsIgnoreCase("salir")) {
                break;
            }
            ropa.add(producto);
        }
        for(int i=0; i<ropa.size(); i++) {
            if(ropaPorProd.containsKey(ropa.get(i))){
                ropaPorProd.put(ropa.get(i), ropaPorProd.get(ropa.get(i))+1);
            }
            else{
                ropaPorProd.put(ropa.get(i), 1);
            }
        }
        ropaPorProd.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
    }
}
