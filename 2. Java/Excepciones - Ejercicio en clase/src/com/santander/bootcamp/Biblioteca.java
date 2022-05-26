package com.santander.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    public List<String> libros;

    public Biblioteca() {
        this.libros = new ArrayList();
    }

    public String prestarLibro() throws Exception {
        if (libros.size() > 0) {

            String libroPrestado = libros.remove(0);
            System.out.println("Se prestó el libro" + libroPrestado);
            return libroPrestado;

        } else {
            throw new Exception("No hay mas libros para prestar.");
        }
    }
}
