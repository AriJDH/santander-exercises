package com.desafioSpring.desafio_spring.excepciones;

import com.desafioSpring.desafio_spring.dto.StatusDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

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
}
