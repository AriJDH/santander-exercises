package com.desafioSpring.desafio_spring.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Personas {

    //Datos utilizados por la clase de Personas
    private String dni;
    private String name;
    private String lastname;
    private String birthDate;
    private String mail;

}
