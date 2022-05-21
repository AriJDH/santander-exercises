package com.santander.Joyeria.exception;

public class JoyaNoExisteException extends RuntimeException{
    public JoyaNoExisteException(){
        super("No existe joya con el número identificatorio ingresado");
    }
}
