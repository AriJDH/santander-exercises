package com.santander.bootcamp.M4C13.exceptions;

public class LinkNotFoundException extends RuntimeException {
    public LinkNotFoundException(String message) {
        super(message);
    }
}
