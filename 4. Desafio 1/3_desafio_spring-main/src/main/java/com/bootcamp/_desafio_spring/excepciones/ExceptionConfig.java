package com.bootcamp._desafio_spring.excepciones;

import com.bootcamp._desafio_spring.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionConfig {

    @ExceptionHandler(HotelNoExisteException.class)
    public ResponseEntity<ErrorDTO> handlerException(HotelNoExisteException hotelNoExisteException){
        ErrorDTO errorDto = new ErrorDTO("Codigo inexistente", "Exception: " + hotelNoExisteException.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HotelNoEstaDisponibleException.class)
    public ResponseEntity<ErrorDTO> handlerException(HotelNoEstaDisponibleException hotelNoEstaDisponibleException){
        ErrorDTO errorDto = new ErrorDTO("Periodo fuera disponibilidad", "Exception: " + hotelNoEstaDisponibleException.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(YaExisteReservaEnPeriodoException.class)
    public ResponseEntity<ErrorDTO> handlerException(YaExisteReservaEnPeriodoException yaExisteReservaEnPeriodoException){
        ErrorDTO errorDto = new ErrorDTO("Periodo no disponible", "Exception: " + yaExisteReservaEnPeriodoException.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(VueloNoExisteException.class)
    public ResponseEntity<ErrorDTO> handlerException(VueloNoExisteException vueloNoExisteException){
        ErrorDTO errorDTO = new ErrorDTO("No existe un vuelo con los parametros ingresados", "Exception: "+vueloNoExisteException.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(VueloYaExisteException.class)
    public ResponseEntity<ErrorDTO> handlerException(VueloYaExisteException vueloYaExisteException){
        ErrorDTO errorDTO = new ErrorDTO("Ya existe un vuelo con los parametros ingresados", "Exception: "+vueloYaExisteException.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HotelYaExisteException.class)
    public ResponseEntity<ErrorDTO> handlerException(HotelYaExisteException hotelYaExisteException){
        ErrorDTO errorDTO = new ErrorDTO("Ya existe un hotel con los parametros ingresados", "Exception: "+hotelYaExisteException.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
    }

}
