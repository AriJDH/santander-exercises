package com.practica.C13Blog.exceptions;

import com.practica.C13Blog.dtos.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionConfig {

    @ExceptionHandler(EntradaYaExisteException.class)
    public ResponseEntity<ErrorDTO> handlerException(EntradaYaExisteException entradaYaExisteException){
        ErrorDTO errorDto = new ErrorDTO("Entrada ya existe", "Exception: " + entradaYaExisteException.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EntradaNoExisteException.class)
    public ResponseEntity<ErrorDTO> handlerException(EntradaNoExisteException entradaNoExisteException){
        ErrorDTO errorDto = new ErrorDTO("Entrada no existe", "Exception: " + entradaNoExisteException.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

}
