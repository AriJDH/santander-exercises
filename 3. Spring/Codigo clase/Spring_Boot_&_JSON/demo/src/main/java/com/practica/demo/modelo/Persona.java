package com.practica.demo.modelo;


import lombok.*;

//Basicamente te hace todo
@AllArgsConstructor //hace constructor automaticamente
@NoArgsConstructor // hace constructor sin parametros
//Con @Data  podemos reemplazar el @Getter @Setter
@Getter
@Setter
@ToString
public class Persona {
    private String nombre;
    private String apellido;


}
