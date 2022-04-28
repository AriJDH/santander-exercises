package com.example.ejercicioBlog.exceptions;


import com.example.ejercicioBlog.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionConfig extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BlogExceptionFind.class)
    public ResponseEntity<ErrorDto> handlerException(BlogExceptionFind blogException){
        ErrorDto errorDto = new ErrorDto();
        errorDto.setNombre("Error en el numero de blog");
        errorDto.setDescripcion("No encontramos el numero mencionado");

        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BlogExceptionExist.class)
    public ResponseEntity<ErrorDto> handlerException(BlogExceptionExist blogException){
        ErrorDto errorDto = new ErrorDto();
        errorDto.setNombre("Error al intentar crear");
        errorDto.setDescripcion("El blog ya existe");

        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }
}
