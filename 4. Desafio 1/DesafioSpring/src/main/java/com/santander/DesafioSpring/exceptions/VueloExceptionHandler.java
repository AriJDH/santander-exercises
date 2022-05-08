package com.santander.DesafioSpring.exceptions;


import com.santander.DesafioSpring.dtos.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(annotations = RestController.class)
public class VueloExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(VueloNotFoundException.class)
    public ResponseEntity<ErrorDTO> vueloNotFoundException (VueloNotFoundException vueloNotFoundException){
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error al mostrar vuelos", vueloNotFoundException.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(VueloFechaException.class)
    public ResponseEntity<ErrorDTO> vueloFechaException (VueloFechaException vueloFechaException){
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error al mostrar vuelos", vueloFechaException.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(VueloDepartOutOfBoundsException.class)
    public ResponseEntity<ErrorDTO> vueloDepartOutOfBoundsException (VueloDepartOutOfBoundsException vueloFechaException){
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error al mostrar vuelos", vueloFechaException.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
