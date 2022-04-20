package com.empresa.modelos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Ejemplar> ejemplares;

    public Biblioteca() {
        ejemplares = new ArrayList<>();
    }

    public Biblioteca(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }


}
