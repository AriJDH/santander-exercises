package com.santander.AgenciaDeTurismo.exceptions;

public class VueloNotFoundException extends RuntimeException {
    public VueloNotFoundException (String mensaje) {
        super (mensaje);
    }
}
