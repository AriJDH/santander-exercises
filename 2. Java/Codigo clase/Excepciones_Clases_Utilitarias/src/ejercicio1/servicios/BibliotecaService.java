package ejercicio1.servicios;

import ejercicio1.excepciones.BibliotecaException;
import ejercicio1.clase.Biblioteca;
import ejercicio1.clase.Libro;

public class BibliotecaService {
    public static double promedioCantidadDeHojas(Biblioteca biblioteca) throws BibliotecaException {
        double totalLibros=0;
        double totalHojas=0;
        if(biblioteca.getLibros().size()==0) {
            throw new BibliotecaException("No tiene libros");
        }
        else {
            for (Libro libro :
                    biblioteca.getLibros()) {
                totalHojas += libro.getCantidadPaginas();
                totalLibros++;
            }
            return totalHojas / totalLibros;
        }


    }
}
