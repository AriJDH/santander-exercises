package com.santander.AgenciaDeTurismo.dtos.response;

import com.santander.AgenciaDeTurismo.models.Vuelo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class ResponseVueloDTO {
    private String flightNumber;
    private String origin;
    private String destination;
    private String seatType;
    private double price;
    private LocalDate dateFrom;
    private LocalDate dateTo;

    public ResponseVueloDTO(Vuelo vuelo) {
        this.flightNumber = vuelo.getFlightNumber();
        this.origin = vuelo.getOrigin();
        this.destination = vuelo.getDestination();
        this.seatType = vuelo.getSeatType();
        this.price = vuelo.getPrice();
        this.dateFrom = vuelo.getDateFrom();
        this.dateTo = vuelo.getDateTo();
    }
}

