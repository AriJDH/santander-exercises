package com.practica.C13Blog.exceptions;

public class EntradaYaExisteException extends RuntimeException {
    public EntradaYaExisteException() {
        super("Ya existe una entrada del Blog con este id");
    }
}
