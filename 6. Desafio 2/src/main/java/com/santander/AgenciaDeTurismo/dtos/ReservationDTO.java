package com.santander.AgenciaDeTurismo.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.santander.AgenciaDeTurismo.validations.vuelo.DepartureIsBeforeArrival;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@DepartureIsBeforeArrival
public class ReservationDTO {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateFrom;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateTo;
    private String origin;
    private String destination;
    private String flightNumber;
    @Min(value = 1, message = "La cantidad de personas debe ser mayor o igual a 1")
    private int seats;
    @Pattern(regexp = "(ECONOMY)|(BUSINESS)", message = "El tipo de habitacion debe ser: ECONOMY o BUSINESS")
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

