package ejemplo1;

import ejemplo1.excepciones.BibliotecaException;
import ejemplo1.modelos.Biblioteca;
import ejemplo1.modelos.Libro;
import ejemplo1.servicios.BibliotecaService;

import java.util.LinkedList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        //promedio de cantidad de hojas de los libros de biblioteca
        // si esta en 0 lanzar excepciones

        List<Libro> libros = new LinkedList<>();
        libros.add(new Libro(400));
        libros.add(new Libro(730));
        libros.add(new Libro(129));
        libros.add(new Libro(900));
        libros.add(new Libro(489));

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setLibros(libros);
        try {
            System.out.println("Promedio de hojas de los libros de la biblioteca: "+ BibliotecaService.promedioCantidadDeHojas(biblioteca));
        }
        catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }
    }
}
