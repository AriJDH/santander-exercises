package com.LasPerlas.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JoyaDtoResponse {
    String nombre, material;
    double peso;
    String particularidad;
    boolean posee_piedra,
            ventaONo;
}
