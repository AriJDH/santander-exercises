package com.santander.AgenciaDeTurismo.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationCreditCardDTO extends @Valid ReservationDTO {
    @Valid
    private  CreditCardDTO paymentMethod;

    public ReservationCreditCardDTO(@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")LocalDate dateFrom, @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")LocalDate dateTo, String origin, String destination, String flightNumber, int seats, String seatType, List<PersonaDTO> people, CreditCardDTO paymentMethod) {
        super(dateFrom, dateTo, origin, destination, flightNumber, seats, seatType, people);
        this.paymentMethod = paymentMethod;
    }
}

