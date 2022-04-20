package PracticaPOO.clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Libro {
    public String nombre;
    public List<Autor> autores;

    public Libro() {
        this.autores = new ArrayList<>();
    }

    public Libro(String nombre, List<Autor> autores) {
        this.nombre = nombre;
        this.autores = autores;
    }

    //Static significa que no se necesita generar una instancia para poder utilizar el método en cuestión
    public static void info() {
        System.out.println("Es un libro, tiene páginas");
    }

    public String mostrarInfo() {
        return nombre + " - " + autores;
    }
}
