package com.jpa.JoyeriaLasPerlas.exception;

public class JoyaNoExisteException extends RuntimeException{

    public JoyaNoExisteException(){
        super("No existe joya con el numero identificatorio ingresado");
    }
}
