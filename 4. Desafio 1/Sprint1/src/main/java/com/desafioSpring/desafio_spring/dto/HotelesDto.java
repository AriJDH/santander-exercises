package com.desafioSpring.desafio_spring.dto;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class HotelesDto {

    //Se utiliza como punto medio para pasar datos de hoteles y mostrarlos en la pagina
    private String codigoHotel;
    private String nombre;
    private String lugarOciudad;
    private String habitacionTipo;
    private double precioNoche;

    private LocalDate disponibleDesde;
    private LocalDate disponibleHasta;
    private String reservado;

}
