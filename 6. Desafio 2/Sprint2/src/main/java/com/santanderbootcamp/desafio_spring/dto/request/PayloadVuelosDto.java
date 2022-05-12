package com.santanderbootcamp.desafio_spring.dto.request;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PayloadVuelosDto {

    //Se utiliza para cargar los datos de reserva del vuelo

    @NotBlank(message = "El campo nombre de usuario no puede estar vacío")
    @Email(message = "Por favor, ingrese un mail válido")
    private String userName;
    private @Valid FlightReservationDto flightReservation;

}

