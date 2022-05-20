package com.jpa.JoyeriaLasPerlas.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JoyaDtoResponse {

        private int nro_identificatorio;

        private String nombre;

        private String material;

        private double peso;

        private String particularidad;

        private boolean posee_piedra;

        private boolean ventaONo;
}
