package com.C13.practicaIntegradora.exceptions;

import com.C13.practicaIntegradora.dtos.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionConfig extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorDto> handlerException(EntradaBlogException entradaBlogException){
        ErrorDto errorDto = new ErrorDto();
        errorDto.setNombre("Post inexistente.");
        errorDto.setDescripcion("Basandonos en el ID proporcionado, no se encontro un post relacionado."+entradaBlogException.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }
}
