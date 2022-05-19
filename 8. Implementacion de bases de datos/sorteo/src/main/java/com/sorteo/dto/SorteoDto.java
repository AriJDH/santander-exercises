package com.sorteo.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SorteoDto {

    private String nombre;
    private String apellido;
    private TemaDto tema;
}
