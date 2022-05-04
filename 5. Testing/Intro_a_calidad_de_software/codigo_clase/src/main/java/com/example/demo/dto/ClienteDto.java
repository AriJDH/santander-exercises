package com.example.demo.dto;


import lombok.*;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ClienteDto {

    @NotEmpty(message= "tiene que tener un nombre")
    private String nombre;
    private String apellido;

}
