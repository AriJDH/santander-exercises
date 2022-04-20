package ejercicio2.service;

import ejercicio2.clases.Biblioteca;
import ejercicio2.clases.Libro;
import ejercicio2.excepciones.BibliotecaException;

public class BibliotecaService {
    public static void PrestarLibro(Biblioteca bibliotecaEmisora,Biblioteca bibliotecaDestino,int cantidadLibros) throws BibliotecaException {
        Libro libroAux;
        if(bibliotecaEmisora.getLibros().size()<cantidadLibros){
            throw new BibliotecaException(cantidadLibros+" libros queres prestar? Tas loco nene? Tenes "+ bibliotecaEmisora.getLibros().size()+" libros");
        }
        else{
            for (int i = 0; i < cantidadLibros; i++) {
                libroAux=bibliotecaEmisora.getLibros().get(0);
                bibliotecaDestino.getLibros().add(libroAux);
                bibliotecaEmisora.getLibros().remove(libroAux);
            }
        }

    }
}
