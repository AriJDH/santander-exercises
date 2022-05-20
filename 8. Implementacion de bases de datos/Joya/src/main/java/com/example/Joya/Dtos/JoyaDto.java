package com.example.Joya.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoyaDto {

    Long nro_identificatorio;
    String nombre;
    String material;
    int peso;
    String particularidad;
    Boolean posee_piedra;
    Boolean ventaONo;
}
