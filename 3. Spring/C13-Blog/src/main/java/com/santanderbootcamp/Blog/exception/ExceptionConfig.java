package com.santanderbootcamp.Blog.exception;

import com.santanderbootcamp.Blog.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionConfig {
    @ExceptionHandler(NuevaEntradaException.class)
    public ResponseEntity<ErrorDto> handlerException(NuevaEntradaException nuevaEntradaException) {
        ErrorDto error = new ErrorDto();
        error.setNombre("La entrada ya existe");
        error.setDescripccion("La entrada con el id provisto ya se encuentra en el blog");
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EntradaException.class)
    public ResponseEntity<ErrorDto> handlerException(EntradaException nuevaEntradaException) {
        ErrorDto error = new ErrorDto();
        error.setNombre("La entrada no se encuentra");
        error.setDescripccion("La entrada con el id provisto no existe");
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
