package com.santanderbootcamp.desafio_spring.dto.request;

import com.santanderbootcamp.desafio_spring.modelos.PaymentMethod;
import com.santanderbootcamp.desafio_spring.modelos.Personas;
import com.santanderbootcamp.desafio_spring.validations.ValidacionCuartoHotel;
import com.santanderbootcamp.desafio_spring.validations.ValidacionPorFecha;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ValidacionPorFecha
@ValidacionCuartoHotel
//Tiene los atributos que se necesintan para el payload booking
public class BookingDto {

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateFrom;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateTo;
    @NotBlank(message = "El campo destino no puede estar vacío")
    private String destination;
    private String hotelCode;
    @Digits(integer = 1, fraction = 0, message = "La cantidad de personas debe ser un número.")
    private int peopleAmount;

    private String roomType;
    private List<@Valid Personas> people;
    private @Valid PaymentMethod paymentMethod;


}
