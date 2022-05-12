package com.desafioSpring.desafio_spring.dto.response;

import com.desafioSpring.desafio_spring.modelos.Personas;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ResponseBookingDto {

    //Clase para poder pasar la información de la reserva de hotel
    @DateTimeFormat
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateFrom;
    @DateTimeFormat
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateTo;
    private String destination;
    private String hotelCode;
    private int peopleAmount;
    private String roomType;
    private List<Personas> people;
}
