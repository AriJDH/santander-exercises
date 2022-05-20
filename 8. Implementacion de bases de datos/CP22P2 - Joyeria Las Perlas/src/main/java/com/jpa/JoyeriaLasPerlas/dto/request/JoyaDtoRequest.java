package com.jpa.JoyeriaLasPerlas.dto.request;

import lombok.*;

@Data
@AllArgsConstructor @NoArgsConstructor
public class JoyaDtoRequest {


    private String nombre;

    private String material;

    private double peso;

    private String particularidad;

    private boolean posee_piedra;

    private boolean ventaONo;
}
