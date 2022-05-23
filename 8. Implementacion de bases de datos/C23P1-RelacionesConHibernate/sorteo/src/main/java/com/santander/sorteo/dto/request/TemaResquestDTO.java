package com.santander.sorteo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TemaResquestDTO {
    //private Integer id;
    private String nombre;
    private String complejidad;
}
