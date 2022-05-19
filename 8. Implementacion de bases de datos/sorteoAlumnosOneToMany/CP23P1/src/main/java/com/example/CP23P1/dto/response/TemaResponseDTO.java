package com.example.CP23P1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemaResponseDTO {

    private String tema_nombre;
    private String complejidad;
}
