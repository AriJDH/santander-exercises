package com.example.CP23P1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AlumnoResponseDrawDTO {
    private String nombre;
    private String apellido;
    private TemaResponseDTO tema;
}
