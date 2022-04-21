package com.santander.sistema;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Consigna: agregar a la clase Libro
        // listas de autores por capitulo
        // capitulo 10 - Pedro y juan (varios autores)
        // capitulo 15 -Pedro
        // capitulo 20 - Maria Pedro
        //
        //metodo para devolver la lista de autores por capitulo

        //Creo, cargo e imprimo una Persona
        Persona per1 = new Persona(34765234,"Anggie",21);
        per1.mostrarInfo();

        //Creo autores
        Autor autor1 = new Autor("Paulo Coelho","Paulo");
        Autor autor2 = new Autor("Isabel Allende","Isa");
        Autor autor3 = new Autor("Wilbur Smith","Smith");

        Libro.info();
        //Creo lista de autores y cargo los autores
        List<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);
        List<Autor> autores2 = new ArrayList<>();
        autores.add(autor3);


        int capitulo = 1;
        HashMap<Integer,List<Autor>> contenido = new HashMap<>();
        contenido.put(capitulo,autores);
        ++capitulo;
        contenido.put(capitulo,autores2);

        Libro libro1 = new Libro("Don Quijote",autores,contenido);

        System.out.println(libro1.devolver_autores(1));
        System.out.println(libro1.devolver_autores(2));

        System.out.println(libro1.mostrarInfo());
    }
}
