package ejemplo2;

import ejemplo2.excepciones.BibliotecaException;
import ejemplo2.modelos.Biblioteca;
import ejemplo2.modelos.Libro;
import ejemplo2.servicios.BibliotecaService;

import java.util.LinkedList;
import java.util.List;

public class App2 {
    // consigna
    // metodo para prestar un libro
    // lance una excepción cuando no hay mas libros
    public static void main(String[] args) {
        List<Libro> libros_emisores = new LinkedList<>();
        libros_emisores.add(new Libro(463));
        libros_emisores.add(new Libro(573));
        libros_emisores.add(new Libro(243));
        libros_emisores.add(new Libro(142));
        libros_emisores.add(new Libro(812));
        Biblioteca biblioteca_emisora = new Biblioteca();
        biblioteca_emisora.setLibros(libros_emisores);

        List<Libro> libros_receptores = new LinkedList<>();
        libros_receptores.add(new Libro(103));
        libros_receptores.add(new Libro(486));
        libros_receptores.add(new Libro(253));
        libros_receptores.add(new Libro(213));
        libros_receptores.add(new Libro(152));
        Biblioteca biblioteca_receptora= new Biblioteca();
        biblioteca_receptora.setLibros(libros_receptores);

        System.out.println("----PRESTO LIBROS (SIN EXCEPCION)----");
        try {
            BibliotecaService.PrestarLibro(biblioteca_emisora,biblioteca_receptora,2);
        } catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("LIBROS EN LA BIBLIOTECA EMISORA: "+biblioteca_emisora.getLibros().size());
        System.out.println("LIBROS EN LA BIBLIOTECA DESTINATARIO: "+biblioteca_receptora.getLibros().size());

        System.out.println("----PRESTO LIBROS (CON EXCEPCION)----");
        try {
            BibliotecaService.PrestarLibro(biblioteca_emisora,biblioteca_receptora,4);
        } catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }
    }
}
