package com.santander.DesafioSpring.exceptions;

import com.santander.DesafioSpring.dtos.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(annotations = RestController.class)
public class HotelExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(HotelNotFoundException.class)
    public ResponseEntity<ErrorDTO> noHotelFoundException(HotelNotFoundException hotelException) {
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.NOT_FOUND.value(), "Error a la hora de mostrar hoteles", hotelException.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(HotelPeriodOutOfBoundsException.class)
    public ResponseEntity<ErrorDTO> hotelPeriodOutOfBoundsException(HotelPeriodOutOfBoundsException hotelException) {
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en el ingreso de reserva", hotelException.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HotelFechaException.class)
    public ResponseEntity<ErrorDTO> hotelFechaException(HotelFechaException hotelException) {
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en el ingreso de reserva", hotelException.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HotelAlreadyReservedException.class)
    public ResponseEntity<ErrorDTO> hotelAlreadyReservedException(HotelAlreadyReservedException hotelException) {
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.BAD_REQUEST.value(), "Error en el ingreso de reserva", hotelException.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
