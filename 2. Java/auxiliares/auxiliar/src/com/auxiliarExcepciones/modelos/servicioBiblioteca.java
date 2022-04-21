package com.auxiliarExcepciones.modelos;

public class servicioBiblioteca {

    public static void noHayMasLibros (biblioteca bi) throws bibliotecaException{
        if (bi.getCantLibros() == 0) {
            throw new bibliotecaException("No hay mas libros");
        }
    }

}
