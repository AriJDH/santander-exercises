package com.santander.Joyeria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;

@AllArgsConstructor
@Getter @Setter

public class ErrorDTO {
    private String nombre;
    private String descripcion;
}
