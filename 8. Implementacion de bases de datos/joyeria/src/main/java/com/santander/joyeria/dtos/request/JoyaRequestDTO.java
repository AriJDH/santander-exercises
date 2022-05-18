package com.santander.joyeria.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoyaRequestDTO {
    String nombre;
    String material;
    Integer peso;
    String particularidad;
    Boolean posee_piedra;
    Boolean ventaONo;
}
