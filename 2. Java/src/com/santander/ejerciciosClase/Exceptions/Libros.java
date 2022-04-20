package com.santander.ejercicioPOO.ejerciciosClase.Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Libros {
    public static void main(String[] args) {
        ArrayList  <String> libros= new ArrayList<String>();
        libros.add("Don quijote");
        libros.add("Harry Potter");
        libros.add("El señor de los anillos");
        libros.remove(2);
        libros.remove(1);
        libros.remove(0);

    try {
        if(libros.size()==0){
            throw new LibrosException();
        }
    } catch (LibrosException ex){
        System.out.println("No hay mas libros");
    }

    }
}
