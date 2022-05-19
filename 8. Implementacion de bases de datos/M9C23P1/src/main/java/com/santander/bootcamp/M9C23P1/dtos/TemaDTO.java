package com.santander.bootcamp.M9C23P1.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TemaDTO {

    private Integer id;
    private String nombreTema;
    private String complejidad;

}
