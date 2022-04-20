package PracticaPOO.clases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    List<Libro> ejemplares = new ArrayList<>();

    public Biblioteca(List<Libro> libros) {
        ejemplares = libros;
    }

    public void prestarLibro() throws BibliotecaException {
        if (ejemplares.size()>0) {
            ejemplares.remove(ejemplares.size() - 1);
        }
    }
}
