package com.jpa.joyeria.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoyaResponseDTO {
    private Integer nro_identificatorio;

    private String nombre;

    private String material;

    private double peso;

    private String particularidad;

    private Boolean ventaONo;
}
