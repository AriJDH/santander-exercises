package ejercicio1.main;

import ejercicio1.excepciones.BibliotecaException;
import ejercicio1.clase.*;
import ejercicio1.servicios.BibliotecaService;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro> libros=new LinkedList<>();
        libros.add(new Libro(103));
        libros.add(new Libro(123));
        libros.add(new Libro(100));
        libros.add(new Libro(113));
        Biblioteca biblioteca= new Biblioteca();
        biblioteca.setLibros(libros);
        try {
            System.out.println("Promedio de hojas de los libros de la biblioteca: "+BibliotecaService.promedioCantidadDeHojas(biblioteca));
        } catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }
    }
}
