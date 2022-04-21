package com.bootcamp.C8P2.clase.modelos;

public class UnidadInexistenteException extends Throwable {
    public UnidadInexistenteException(String unidad_inexistente) {
        super(unidad_inexistente);
    }
}
