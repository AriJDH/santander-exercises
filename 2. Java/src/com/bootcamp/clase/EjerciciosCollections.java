package com.bootcamp.clase;

import java.util.*;

public class EjerciciosCollections {
    public void ejercicio_array_lists() {
        List<String> nombres = new ArrayList<>();

        nombres.add("Jorge");


        List<String> nombres_link = new LinkedList<>();

        nombres_link.add("Zelda");


        nombres_link.add(1, "Link");
        nombres_link.remove(1);
        nombres.add(0,"Carlos");

        for (String nombre: nombres) {
            System.out.println("Nombre: " + nombre);
        }

        for (int i = 0; i < nombres_link.size(); i++) {
            System.out.println(nombres_link.get(i));
        }
    }

    public void ejercicio_lista_notas_alumnos() {
        boolean seguir = true;
        String nombre_alumno = "";
        int nota = 0;
        List<String> nombres = new ArrayList<>();
        List<Integer> notas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        while(seguir){
            System.out.print("Ingrese nombre del alumno (ingrese Q para terminar): ");
            nombre_alumno = teclado.next();
            seguir = !nombre_alumno.equalsIgnoreCase("q");
            if (seguir){
                System.out.print("Ingrese nota del alumno: ");
                nota = teclado.nextInt();
                nombres.add(nombre_alumno);
                notas.add(nota);
            }
        }

        List<String> nombres_desaprobados = new ArrayList<>();
        List<String> nombres_a_final = new ArrayList<>();
        List<String> nombres_promociona = new ArrayList<>();
        for (int i = 0; i < nombres.size(); i++) {
            if(notas.get(i) < 4){
                nombres_desaprobados.add(nombres.get(i));
            } else if (notas.get(i) < 7){
                nombres_a_final.add(nombres.get(i));
            } else {
                nombres_promociona.add(nombres.get(i));
            }
        }

        System.out.println("A final: ");
        for (int i = 0; i < nombres_desaprobados.size(); i++) {
            System.out.print(nombres_a_final.get(i));
        }
    }

    public void sets() {
        // no permite duplicados
        Set<String> apellidos = new TreeSet<>();
        apellidos.add("Juan");
        // no lo agrega
        apellidos.add("Juan");
        for (String apellido :
                apellidos) {
            System.out.println(apellido);
        }
    }

    public void diccionarios() {
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(0, "Agus");

        for (int i = 0; i < mapa.size(); i++) {
            System.out.println("Nombre:" + mapa.get(i));
        }

        for(Map.Entry<Integer,String> entrada : mapa.entrySet()){
            Integer clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println("Clave es " + clave + " con valor " + valor);
        }

        // usando funcion lambda
        mapa.forEach((k,v)-> System.out.println("Clave " + k + " valor " + v));
    }

    public void ejercicio_listas_diccionario() {
        boolean seguir = true;
        String nombre_alumno = "";
        int nota = 0;
        List<String> productos = new ArrayList<>();
        List<Integer> cantidades = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        //1. cargar listas
        while(seguir){
            System.out.print("Ingrese nombre del producto (ingrese Q para terminar): ");
            nombre_alumno = teclado.next();
            seguir = !nombre_alumno.equalsIgnoreCase("q");
            if (seguir){
                System.out.print("Ingrese cantidad del producto: ");
                nota = teclado.nextInt();
                productos.add(nombre_alumno);
                cantidades.add(nota);
            }
        }

        //2. armar mapa
        HashMap<String, Integer> producto_cantidad = new HashMap<>();

        for (int i = 0; i < productos.size(); i++) {
            String clave = productos.get(i);
            if(producto_cantidad.containsKey(clave)){
                Integer cantidad_actual = producto_cantidad.get(clave);
                producto_cantidad.put(clave, cantidad_actual + cantidades.get(i));
            } else {
                producto_cantidad.put(clave, cantidades.get(i));
            }
        }

        //3. mostrar mapa
        for(Map.Entry<String,Integer> entrada : producto_cantidad.entrySet()){
            String clave = entrada.getKey();
            Integer valor = entrada.getValue();
            System.out.println("Clave es " + clave + " con valor " + valor);
        }

    }
}
