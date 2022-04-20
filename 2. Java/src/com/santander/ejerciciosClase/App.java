package com.santander.ejercicioPOO.ejerciciosClase;

import com.santander.ejercicioPOO.ejerciciosClase.modelo.Autor;
import com.santander.ejercicioPOO.ejerciciosClase.modelo.Libro;
import com.santander.ejercicioPOO.ejerciciosClase.modelo.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Libro.info();

        Libro libro2 = new Libro();
        List<Autor> autores = null;
        Libro libro1 = new Libro("Juan", autores);

        Map<String,String> capAutor = Map.ofEntries(
                Map.entry("Capitulo 1", "Jorge"), Map.entry("Capitulo 2", "Jorge"),Map.entry("Capitulo 3", "Jorge")
        );

        autores = new ArrayList<Autor>();

        libro1.setAutores(autores);
        libro1.setNombre("Don Quijote");
        libro1.setContenido(capAutor);

        /*System.out.println(libro1.autor);
        System.out.println(libro1.nombre);

        Libro libro2 = libro1;

        libro2.autor="Pedro";

        System.out.println(libro1.autor);*/

        System.out.println(libro1.mostrarInfo());

        Persona per1 = new Persona();

        per1.mostrarInfo();

        System.out.println(per1.toString());

        System.out.println(libro1.toString());
    }
}
