package ejemplo1.modelos;

import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    List<Libro> libros;

    public Biblioteca() {
        this.libros = new LinkedList<>();
    }

    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
