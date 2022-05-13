package com.santanderbootcamp.desafio_spring.dto.request;

import com.santanderbootcamp.desafio_spring.modelos.PaymentMethod;
import com.santanderbootcamp.desafio_spring.modelos.Personas;
import com.santanderbootcamp.desafio_spring.validations.ValidacionPorFecha;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ValidacionPorFecha
// Tiene los atributos necesarios para el payload vuelo
public class FlightReservationDto {
    @DateTimeFormat
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateFrom;
    @DateTimeFormat
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateTo;

    @NotBlank(message = "El campo origen no puede estar vacío")
    private String origin;
    @NotBlank(message = "El campo destino no puede estar vacío")
    private String destination;
    private String flightNumber;
    @Digits(integer = 2, fraction = 0)
    private int seats;
    private String seatType;
    private List<@Valid Personas> people;
    private @Valid PaymentMethod paymentMethod;
}
