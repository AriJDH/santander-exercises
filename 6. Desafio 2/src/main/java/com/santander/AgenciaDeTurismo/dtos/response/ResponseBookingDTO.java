package com.santander.AgenciaDeTurismo.dtos.response;

import com.santander.AgenciaDeTurismo.dtos.BookingDTO;
import com.santander.AgenciaDeTurismo.dtos.ResponseStatusDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestBookingDTO;
import com.santander.AgenciaDeTurismo.models.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseBookingDTO {
    private String userName;
    private double amount;
    private double interest;
    private double total;
    private BookingDTO booking;
    private ResponseStatusDTO response;

    public ResponseBookingDTO(RequestBookingDTO request,double interest, Hotel hotel, ResponseStatusDTO responseStatus) {
        userName = request.getUserName();
        amount = hotel.getPrice();
        this.interest = interest;
        total = amount + amount*interest/100;
        booking = new BookingDTO(request.getBooking());
        response = responseStatus;
    }
}