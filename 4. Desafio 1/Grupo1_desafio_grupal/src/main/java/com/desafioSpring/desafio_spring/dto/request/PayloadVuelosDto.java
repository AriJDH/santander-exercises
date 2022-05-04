package com.desafioSpring.desafio_spring.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PayloadVuelosDto {

    //Se utiliza para cargar los datos de reserva del vuelo
    private String userName;
    private FlightReservationDto flightReservation;

}

