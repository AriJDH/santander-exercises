package com.example.C13EjercicioPracticoBlog.exception;

import com.example.C13EjercicioPracticoBlog.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionConfig extends ResponseEntityExceptionHandler {
    @ExceptionHandler(BlogException.class)
    public ResponseEntity<ErrorDTO> blogException(BlogException blogException) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setId("Id inválido");
        errorDTO.setDescripcion("Ya existe el blog ingresado " + blogException.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
    }

}
