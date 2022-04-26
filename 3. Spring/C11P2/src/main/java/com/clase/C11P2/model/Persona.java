package com.clase.C11P2.model;


import lombok.*;

//usamos Lombok
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;

}
