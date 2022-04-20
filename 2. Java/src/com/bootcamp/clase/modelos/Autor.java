package com.bootcamp.clase.modelos;

public class Autor {
    public String nombre;
    public String alias;

    public Autor(String nombre,String alias){
        this.nombre = nombre;
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "Autor {nombre: " + nombre +
                ", alias: " + alias + "}";
    }
}
