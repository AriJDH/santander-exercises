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
public class BookingCreditCardDTO extends @Valid BookingDTO{
    @Valid
    private CreditCardDTO paymentMethod;

    public BookingCreditCardDTO(@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy") LocalDate dateFrom, @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy") LocalDate dateTo, String destination, String hotelCode, int peopleAmount, String roomType, List<PersonaDTO> people, CreditCardDTO paymentMethod) {
        super(dateFrom, dateTo, destination, hotelCode, peopleAmount, roomType, people);
        this.paymentMethod = paymentMethod;
    }
}
