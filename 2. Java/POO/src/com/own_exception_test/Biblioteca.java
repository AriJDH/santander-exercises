package com.own_exception_test;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    public Biblioteca(){
        libros= new ArrayList<Libro>();
    }

    public Libro prestarLibro() throws ExceptionJuani {
       if (libros.size()==0){
           throw new ExceptionJuani("no hay más libros");
       }else{
           Libro last= libros.get(libros.size()-1);
           libros.remove(libros.size()-1);
           return last;  //ultimo libro
       }
    }
}
