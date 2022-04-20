package com.empresa.servicios;

import com.empresa.excepciones.BibliotecaException;
import com.empresa.modelos.Biblioteca;

public class BibliotecaService {

    // promedio de cantidad de hojas de los libros de biblioteca
    // si esta en 0 lanzar una excepcion


    public static void promedioCantidadHojasLibros(Biblioteca biblioteca) throws BibliotecaException {

        if(biblioteca.getEjemplares().size() == 0) {
            throw new BibliotecaException("No hay libros, no se puede calcular el promedio");
        }

    }


}
