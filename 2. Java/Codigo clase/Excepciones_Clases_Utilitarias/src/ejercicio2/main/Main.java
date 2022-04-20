package ejercicio2.main;

import ejercicio2.clases.Biblioteca;
import ejercicio2.clases.Libro;
import ejercicio2.excepciones.BibliotecaException;
import ejercicio2.service.BibliotecaService;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro> librosEmisor=new LinkedList<>();
        librosEmisor.add(new Libro(103));
        librosEmisor.add(new Libro(123));
        librosEmisor.add(new Libro(100));
        librosEmisor.add(new Libro(113));
        Biblioteca bibliotecaEmisora= new Biblioteca();
        bibliotecaEmisora.setLibros(librosEmisor);


        List<Libro> librosDestinatario=new LinkedList<>();
        librosDestinatario.add(new Libro(103));
        librosDestinatario.add(new Libro(123));
        librosDestinatario.add(new Libro(100));
        librosDestinatario.add(new Libro(113));
        Biblioteca bibliotecaDestinatario= new Biblioteca();
        bibliotecaDestinatario.setLibros(librosDestinatario);

        System.out.println("----PRESTO LIBROS (SIN EXCEPCION)----");
        try {
            BibliotecaService.PrestarLibro(bibliotecaEmisora,bibliotecaDestinatario,2);
        } catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("LIBROS EN LA BIBLIOTECA EMISORA: "+bibliotecaEmisora.getLibros().size());
        System.out.println("LIBROS EN LA BIBLIOTECA DESTINATARIO: "+bibliotecaDestinatario.getLibros().size());

        System.out.println("----PRESTO LIBROS (CON EXCEPCION)----");
        try {
            BibliotecaService.PrestarLibro(bibliotecaEmisora,bibliotecaDestinatario,5);
        } catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }
    }
}
