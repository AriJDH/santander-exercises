package com.auxiliarPOO.uno;
import com.auxiliarPOO.uno.modelos.Autor;
import com.auxiliarPOO.uno.modelos.Libro;
import com.auxiliarPOO.uno.modelos.Persona;
import jdk.jshell.execution.LoaderDelegate;
import java.util.*;


public class app {
    public static void main(String[] args) {

        List<Autor> autores = new ArrayList<Autor>();
        Autor au1 = new Autor("Martin");
        Autor au2 = new Autor("Carlos");
        Autor au3 = new Autor("Mariana");
        Autor au4 = new Autor("Julia");

        autores.add(au1);
        autores.add(au2);
        autores.add(au3);
        autores.add(au4);



        Libro libro1 = new Libro("Don Quijote", autores, 10);



        libro1.cargarCapitulo();

        /*libro1.setAutores(autores);
        libro1.setNombre("Don Quijote");*/

        /*System.out.println(libro1.autor);
        System.out.println(libro1.nombre);

        Libro libro2 = libro1;

        libro2.autor = "Pedro";
        System.out.println(libro1.autor);*/

        System.out.println(libro1.mostrarInfo());

        Persona per1 = new Persona();
        per1.mostrarInfo();


    }
}
