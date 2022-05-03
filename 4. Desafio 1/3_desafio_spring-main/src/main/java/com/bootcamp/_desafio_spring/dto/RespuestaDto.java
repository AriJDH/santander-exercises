package com.bootcamp._desafio_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Data
public class RespuestaDto {
    private Integer codigo;
    private String msg;
}
