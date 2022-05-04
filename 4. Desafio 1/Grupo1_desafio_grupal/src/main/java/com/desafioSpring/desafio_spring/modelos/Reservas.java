package com.desafioSpring.desafio_spring.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reservas {

    //Datos utilizados por la clase de Reservas
    private String codigoReserva;
    private String tipo;
    private LocalDate desdeFecha;
    private LocalDate hastaFecha;
    private String user;
    private Double precioTotal;
}
