package com.santander.sorteo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AlumnoResquestDTO {
    private String nombre;
    private String apellido;
    private String dni;
    private String curso;
    private TemaIDRequestDTO tema;
}
