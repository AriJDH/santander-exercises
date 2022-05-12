package com.santanderbootcamp.desafio_spring.excepciones;

import com.santanderbootcamp.desafio_spring.dto.StatusDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Objects;

@ControllerAdvice
public class ExceptionConfig {

    //Excepcion usada para errores de hoteles
    @ExceptionHandler(HotelesException.class)
    public ResponseEntity<StatusDto> handlerException(HotelesException hotelesException) {
        StatusDto statusDto = new StatusDto();
        statusDto.setCode(400);
        statusDto.setMessage(hotelesException.getMessage());
        return new ResponseEntity<>(statusDto, HttpStatus.BAD_REQUEST);
    }

    //Excepcion usada para errores de vuelos
    @ExceptionHandler(VuelosException.class)
    public ResponseEntity<StatusDto> handlerException(VuelosException vuelosException) {
        StatusDto statusDto = new StatusDto();
        statusDto.setCode(400);
        statusDto.setMessage(vuelosException.getMessage());
        return new ResponseEntity<>(statusDto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<StatusDto> handleValidationExceptions(MethodArgumentNotValidException e) {
        StatusDto error = new StatusDto(404, Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    protected ResponseEntity<StatusDto> handleValidationExceptions(HttpMessageNotReadableException e) {
        StatusDto error = new StatusDto(404, e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(FechasNoValidasException.class)
    protected ResponseEntity<StatusDto> handleValidationExceptions(FechasNoValidasException e) {
        StatusDto statusDto = new StatusDto();
        statusDto.setCode(404);
        statusDto.setMessage(e.getMessage());
        return new ResponseEntity<>(statusDto, HttpStatus.BAD_REQUEST);
    }
}
