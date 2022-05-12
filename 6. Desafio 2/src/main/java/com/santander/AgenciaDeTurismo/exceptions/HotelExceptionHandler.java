package com.santander.AgenciaDeTurismo.exceptions;


import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.santander.AgenciaDeTurismo.dtos.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.format.DateTimeParseException;


@ControllerAdvice(annotations = RestController.class)
public class HotelExceptionHandler{

    @ExceptionHandler(HotelNotFoundException.class)
    public ResponseEntity<ErrorDTO> noHotelFoundException(HotelNotFoundException hotelException) {
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.NOT_FOUND.value(), "Error a la hora de mostrar hoteles", hotelException.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(HotelPeriodOutOfBoundsException.class)
    public ResponseEntity<ErrorDTO> hotelPeriodOutOfBoundsException(HotelPeriodOutOfBoundsException hotelException) {
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en el ingreso de datos", hotelException.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HotelFechaException.class)
    public ResponseEntity<ErrorDTO> hotelFechaException(HotelFechaException hotelException) {
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en el ingreso de datos", hotelException.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HotelAlreadyReservedException.class)
    public ResponseEntity<ErrorDTO> hotelAlreadyReservedException(HotelAlreadyReservedException hotelException) {
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en el ingreso de reserva", hotelException.getMessage()), HttpStatus.BAD_REQUEST);
    }

    // TODO: querido futuro grupo, en caso de tener problema con excepciones de fecha, revisar aca :)
    /*
    @ExceptionHandler(DateTimeParseException.class)
    protected ResponseEntity<ErrorDTO> handleValidationExceptions(DateTimeParseException e) {
        ErrorDTO error = new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en el formato de la fecha ingresada", "Formato de fecha debe ser dd/mm/aaaa");
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    } */

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorDTO> handleValidationExceptions(MethodArgumentNotValidException e) {
        ErrorDTO error = new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en las validaciones", e.getBindingResult().getFieldError().getDefaultMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidFormatException.class)
    protected ResponseEntity<ErrorDTO> handleValidationExceptions(InvalidFormatException e) {
        ErrorDTO error;
        if(e.getMessage().contains("peopleAmount") || e.getMessage().contains("seats") ) {
            error = new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en las validaciones", "La cantidad de personas debe ser un valor numerico");

        } else if(e.getMessage().contains("dateTo") || e.getMessage().contains("dateFrom"))  {
            error = new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en las validaciones", "Formato de fecha debe ser dd/mm/aaaa");
        }
        else {
            error = new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en las validaciones", e.getMessage());
        }
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HotelDestinationNotFoundException.class)
    public ResponseEntity<ErrorDTO> hotelDestinationNotFoundException(HotelDestinationNotFoundException hotelException) {
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en el ingreso de reserva", hotelException.getMessage()), HttpStatus.BAD_REQUEST);
    }

}

