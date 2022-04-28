package com.ejerciciointegrador.Ejercicio_Integrador.excepciones;

import com.ejerciciointegrador.Ejercicio_Integrador.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(annotations = RestController.class)
public class HandlerBlogException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BlogNotFoundException.class)
    public ResponseEntity<ErrorDTO> blogNotFoundException(BlogNotFoundException blogException){
            return new ResponseEntity<>(new ErrorDTO("Id invalido",blogException.getMessage()),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BlogIdTakenException.class)
    public ResponseEntity<ErrorDTO> blogNotFoundException(BlogIdTakenException blogException){
        return new ResponseEntity<>(new ErrorDTO("Id invalido",blogException.getMessage()),HttpStatus.ALREADY_REPORTED);
    }
}
