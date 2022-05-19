package com.example.sorteo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RequestTemaDto {

    private int id;

    private String nombre;

    private String complejidad;
}
