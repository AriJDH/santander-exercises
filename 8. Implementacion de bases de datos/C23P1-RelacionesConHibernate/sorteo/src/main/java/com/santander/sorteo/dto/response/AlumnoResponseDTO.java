package com.santander.sorteo.dto.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AlumnoResponseDTO {
    private String nombre;
    private String apellido;
    private TemaResponseDTO tema;

}
