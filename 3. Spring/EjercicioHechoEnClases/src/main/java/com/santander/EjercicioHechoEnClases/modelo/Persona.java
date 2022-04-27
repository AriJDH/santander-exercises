package com.santander.EjercicioHechoEnClases.modelo;

import lombok.*;

//usamos Lombok
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
}
