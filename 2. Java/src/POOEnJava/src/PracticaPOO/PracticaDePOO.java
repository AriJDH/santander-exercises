package PracticaPOO;

import PracticaPOO.clases.Autor;
import PracticaPOO.clases.Libro;

import java.util.ArrayList;
import java.util.List;

public class PracticaDePOO {
    public static void main(String[] args) {
        List<Autor> autores = new ArrayList<>();
        Libro.info();
        Autor juan = new Autor();
        juan.nombre = "Juan";
        juan.alias = "Juancito";
        autores.add(juan);
        Libro libro1 = new Libro("Don Quijote", autores);
        System.out.println(libro1.autores);
        System.out.println(libro1.nombre);
        Libro libro2 = libro1;
        libro2.autores = autores;
        System.out.println(libro1.autores);
        System.out.println(libro1.mostrarInfo());
        System.out.println("Consigna: Agregar a la clase libro la lista de autores por capítulos.");
    }


}
