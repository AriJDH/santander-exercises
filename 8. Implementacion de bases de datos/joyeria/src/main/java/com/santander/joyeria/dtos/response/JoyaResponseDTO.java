package com.santander.joyeria.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoyaResponseDTO {
    private Integer numero_identificatorio;
    private String nombre;
    private String material;
    private Integer peso;
    private String particularidad;
    private Boolean posee_piedra;
    private Boolean ventaONo;
}
