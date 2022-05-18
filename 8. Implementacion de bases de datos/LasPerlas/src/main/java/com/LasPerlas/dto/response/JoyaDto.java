package com.LasPerlas.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JoyaDto {
    String nombre, material;
    double peso;
    String particularidad;
    boolean posee_piedra,
            ventaONo;
}
