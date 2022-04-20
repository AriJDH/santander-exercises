package com.empresa;

import com.empresa.modelos.Autor;
import com.empresa.modelos.Libro;
import com.empresa.modelos.Persona;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Libro.info();

        List<Autor> autores = new ArrayList<>();
        Libro libro1 = new Libro("Don Quijote",autores);

        System.out.println(libro1.mostrarInfo());

        //
        //  Consigna, agregar a la clase Libro
        //  listas de autores por capitulos
        //  capitulo 10  - Pedro y juan
        //  capitlo  15  - Pedro
        //  capitulo 20  - Maria Pedro
        //
        //  metodo para devolver lista de autores
        //  por capitulo
        //

        /*
        System.out.println(libro1.autor);
        System.out.println(libro1.nombre);
        Libro libro2 = libro1;
        libro2.autor = "Pedro";
        System.out.println(libro1.autor);
        */


        Persona per1 = new Persona();
        per1.mostrarInfo();
        System.out.println(per1);

    }
}
