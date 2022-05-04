package com.santander.AgenciaDeTurismo.dtos.response;

import com.santander.AgenciaDeTurismo.models.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


@AllArgsConstructor
@Data
public class ResponseHotelDTO {
    private String hotelCode;
    private String name;
    private String destination;
    private String roomType;
    private double price;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private boolean isReserved;


    public ResponseHotelDTO(Hotel hotel) {
        this.hotelCode = hotel.getHotelCode();
        this.name = hotel.getName();
        this.destination = hotel.getDestination();
        this.roomType = hotel.getRoomType();
        this.price = hotel.getPrice();
        this.dateFrom = hotel.getDateFrom();
        this.dateTo = hotel.getDateTo();
        this.isReserved = hotel.isReserved();
    }
}
