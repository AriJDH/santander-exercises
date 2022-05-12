package com.santander.AgenciaDeTurismo.exceptions;


import com.santander.AgenciaDeTurismo.dtos.ErrorDTO;
import com.santander.AgenciaDeTurismo.models.Vuelo;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.time.format.DateTimeParseException;

@ControllerAdvice(annotations = RestController.class)
public class VueloExceptionHandler {

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

    @ExceptionHandler(VueloPlaceException.class)
    public ResponseEntity<ErrorDTO> vueloPlaceException (VueloPlaceException vueloPlaceException) {
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error vuelos", vueloPlaceException.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    protected ResponseEntity<ErrorDTO> handleValidationExceptions(ConstraintViolationException e) {
        ErrorDTO error = new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error vuelos", e.getMessage() );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DateTimeParseException.class)
    protected ResponseEntity<ErrorDTO> handleValidationExceptions(DateTimeParseException e) {
        ErrorDTO error = new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en el formato de la fecha ingresada", "Formato de fecha debe ser dd/mm/aaaa");
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}

