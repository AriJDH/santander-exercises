package com.practica.practica.exception;

import com.practica.practica.dtos.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionConfig extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PersonaException.class)
    public ResponseEntity<ErrorDto> handlerException(PersonaException personaException){
        ErrorDto errorDto = new ErrorDto();
        errorDto.setNombre("Sin registro de cliente");
        errorDto.setDescripcion("No se encuentra registros " + personaException.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }
}
