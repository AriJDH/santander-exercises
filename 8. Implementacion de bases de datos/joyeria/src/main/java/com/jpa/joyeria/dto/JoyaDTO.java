package com.jpa.joyeria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoyaDTO {

    private String nombre;

    private String material;

    private double peso;

    private String particularidad;

    private Boolean ventaONo;
}
