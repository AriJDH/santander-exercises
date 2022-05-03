package com.bootcamp._desafio_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MetodoPagoDto {
    private String tipo;
    private String numeroTarjeta;
    private Integer cuotas;
}
