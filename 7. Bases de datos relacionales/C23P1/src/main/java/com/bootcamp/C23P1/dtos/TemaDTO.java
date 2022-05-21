package com.bootcamp.C23P1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TemaDTO {
    private Integer id;
    private String nombre;
    private String complejidad;
}
