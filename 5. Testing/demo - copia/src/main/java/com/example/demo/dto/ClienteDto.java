package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ClienteDto {
    @NotEmpty(message = "El campo nombre no deberia estar vacio")
    private String nombre;
    private String apellido;

}
