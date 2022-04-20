package com.empresa.modelos;

public class Ejemplar {

    private int numeroEjemplar;
    private Libro libro;

    public Ejemplar() {
    }

    public Ejemplar(int numeroEjemplar, Libro libro) {
        this.numeroEjemplar = numeroEjemplar;
        this.libro = libro;
    }

    public int getNumeroEjemplar() {
        return numeroEjemplar;
    }

    public void setNumeroEjemplar(int numeroEjemplar) {
        this.numeroEjemplar = numeroEjemplar;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
