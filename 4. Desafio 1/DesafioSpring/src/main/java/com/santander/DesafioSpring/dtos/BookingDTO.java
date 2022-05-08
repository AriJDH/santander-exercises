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
public class BookingDTO {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateTo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateFrom;
    private String destination;
    private String hotelCode;
    private int peopleAmount;
    private String roomType;
    private List<PersonaDTO> people;

    public BookingDTO(BookingCreditCardDTO booking) {
        dateFrom = booking.getDateFrom();
        dateTo = booking.getDateTo();
        destination = booking.getDestination();
        hotelCode = booking.getHotelCode();
        peopleAmount = booking.getPeopleAmount();
        roomType = booking.getRoomType();
        people = booking.getPeople();
    }
}
