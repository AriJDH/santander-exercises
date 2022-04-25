package ejemplo2.servicios;

import ejemplo2.modelos.Libro;
import ejemplo2.excepciones.BibliotecaException;
import ejemplo2.modelos.Biblioteca;

public class BibliotecaService {
    public static void PrestarLibro(Biblioteca biblioteca_emisora, Biblioteca biblioteca_receptora, int cantidad_libros) throws BibliotecaException {
        Libro libro_prestado;
        if (biblioteca_emisora.getLibros().size() < cantidad_libros){
            throw new BibliotecaException( "Tenés "+ biblioteca_emisora.getLibros().size()+" libros y queres prestar "+cantidad_libros+" libros");
        }
        else{
            for(int i=0; i < cantidad_libros; i++){
                libro_prestado = biblioteca_emisora.getLibros().get(0);
                biblioteca_receptora.getLibros().add(libro_prestado);
                biblioteca_emisora.getLibros().remove(libro_prestado);
            }
        }
    }
}
