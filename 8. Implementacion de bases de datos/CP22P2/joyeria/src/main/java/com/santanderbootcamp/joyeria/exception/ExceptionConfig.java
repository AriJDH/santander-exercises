package com.santanderbootcamp.joyeria.exception;

import com.santanderbootcamp.joyeria.dto.StatusDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionConfig {
    @ExceptionHandler(JewerlyException.class)
    public ResponseEntity<StatusDTO> exception(JewerlyException jewerlyException) {
        StatusDTO status = new StatusDTO(400, jewerlyException.getMessage());
        return new ResponseEntity<>(status, HttpStatus.BAD_REQUEST);
    }
}
