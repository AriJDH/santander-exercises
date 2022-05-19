package com.example.CP23P1.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemaCreateRequestDTO {

    private String tema_nombre;
    private String complejidad;
}
