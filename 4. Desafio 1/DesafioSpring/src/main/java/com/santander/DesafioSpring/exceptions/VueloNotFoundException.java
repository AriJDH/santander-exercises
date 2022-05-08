package com.santander.DesafioSpring.exceptions;

public class VueloNotFoundException extends RuntimeException {
    public VueloNotFoundException (String mensaje) {
        super (mensaje);
    }
}
