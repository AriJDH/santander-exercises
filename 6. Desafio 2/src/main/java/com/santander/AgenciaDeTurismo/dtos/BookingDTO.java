package com.santander.AgenciaDeTurismo.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.santander.AgenciaDeTurismo.validations.hotel.MatchRoomTypeWithPeople;
import com.santander.AgenciaDeTurismo.validations.hotel.PeopleAmountV;
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
@MatchRoomTypeWithPeople
public class BookingDTO {
    //@Pattern(regexp = "[0-9]{2}/[0-9]{2}/[0-9]{4}", message = "Formato de fecha invalida")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateFrom;
    //@Pattern(regexp = "[0-9]{2}/[0-9]{2}/[0-9]{4}", message = "Formato de fecha invalida")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateTo;
    private String destination;
    private String hotelCode;
    @Min(value = 1, message = "La cantidad de personas debe ser mayor o igual a 1")
    //@PeopleAmountV
    private int peopleAmount;
    @Pattern(regexp = "(SINGLE)|(DOUBLE)|(TRIPLE)|(MULTIPLE)", message = "El tipo de habitacion debe ser: SINGLE, DOUBLE, TRIPLE o MULTIPLE")
    private String roomType;
    private List<PersonaDTO> people;

    // TODO: 10/05/2022 Considerar agregar validacion para que peopleAmount sea igual a people.size() si nos sobra tiempo. 

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
