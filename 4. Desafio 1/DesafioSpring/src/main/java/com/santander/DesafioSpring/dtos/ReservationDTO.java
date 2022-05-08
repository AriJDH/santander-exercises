package com.santander.DesafioSpring.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateFrom;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateTo;
    private String destination;
    private String origin;
    private String flightNumber;
    private int seats;
    private String seatType;
    private List<PersonaDTO> people;

    public ReservationDTO(ReservationCreditCardDTO reservation) {
        dateFrom = reservation.getDateFrom();
        dateTo = reservation.getDateTo();
        destination = reservation.getDestination();
        flightNumber = reservation.getFlightNumber();
        seats = reservation.getSeats();
        seatType = reservation.getSeatType();
        people = reservation.getPeople();
        origin = reservation.getOrigin();
    }


}
