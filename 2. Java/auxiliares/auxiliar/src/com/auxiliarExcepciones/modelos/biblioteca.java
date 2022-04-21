package com.auxiliarExcepciones.modelos;

public class biblioteca {

    int cantLibros;

    public biblioteca(int cantLibros) {
        this.cantLibros = cantLibros;
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public void setCantLibros(int cantLibros) {
        this.cantLibros = cantLibros;
    }

    public void prestar() {
        do {
            cantLibros --;
            System.out.println("Quedan " + cantLibros + " libros");
        } while (cantLibros > 0);
    }
}
