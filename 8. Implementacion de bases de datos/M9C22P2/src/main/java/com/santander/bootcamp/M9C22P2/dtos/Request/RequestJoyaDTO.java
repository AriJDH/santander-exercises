package com.santander.bootcamp.M9C22P2.dtos.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RequestJoyaDTO {

    private String nombre;

    private String material;

    private Double peso;

    private String particularidad;

    private Boolean posee_piedra;

    private Boolean ventaONo;

}
