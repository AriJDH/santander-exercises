package com.blogExcepciones.blogExcepciones.excepcion;

import com.blogExcepciones.blogExcepciones.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionConfig extends ResponseEntityExceptionHandler {


    @ExceptionHandler(ExceptionEncontrada.class)
    public ResponseEntity<ErrorDto> handlerException(ExceptionEncontrada exceptionEncontrada){
        ErrorDto errorDto = new ErrorDto();
        errorDto.setNombre("cargado");
        errorDto.setDescripcion("registro cargado "+ exceptionEncontrada.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);

    }
    @ExceptionHandler(ExceptionNoEncontrado.class)
    public ResponseEntity<ErrorDto> handlerException(ExceptionNoEncontrado exceptionNoEncontrado){
        ErrorDto errorDto = new ErrorDto();
        errorDto.setNombre("no cargado");
        errorDto.setDescripcion("no se encuentra registro "+ exceptionNoEncontrado.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);

    }
}
