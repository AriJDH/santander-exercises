package com.santanderbootcamp.desafio_spring.modelos;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Personas {

    //Datos utilizados por la clase de Personas
    private String dni;
    @NotBlank()
    private String name;
    private String lastname;
    private String birthDate;

    @Email(message = "Por favor, ingrese un e-mail válido")
    private String mail;

}
