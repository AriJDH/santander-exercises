package ejemplo1.servicios;

import ejemplo1.excepciones.BibliotecaException;
import ejemplo1.modelos.Libro;
import ejemplo1.modelos.Biblioteca;

//promedio de cantidad de hojas de los libros de biblioteca
// si esta en 0 lanzar excepción

public class BibliotecaService {
    public static double promedioCantidadDeHojas(Biblioteca biblioteca) throws BibliotecaException{
        double totalLibros=0;
        double totalHojas=0;
        if(biblioteca.getLibros().size()==0) {
            throw new BibliotecaException("No tiene libros");
        }
        else {
            for (Libro libro : biblioteca.getLibros()) {
                totalHojas += libro.getCantidad_paginas();
                totalLibros++;
            }
            return totalHojas / totalLibros;
        }
    }
}
