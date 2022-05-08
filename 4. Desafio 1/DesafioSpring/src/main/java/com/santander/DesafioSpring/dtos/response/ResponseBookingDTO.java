package com.santander.DesafioSpring.dtos.response;

import com.santander.DesafioSpring.dtos.BookingDTO;
import com.santander.DesafioSpring.dtos.ResponseStatusDTO;
import com.santander.DesafioSpring.dtos.request.RequestBookingDTO;
import com.santander.DesafioSpring.models.Hotel;
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

    public ResponseBookingDTO(RequestBookingDTO request, Hotel hotel, ResponseStatusDTO responseStatus) {
        userName = request.getUserName();
        amount = hotel.getPrice();
        interest = 21;
        total = amount + amount*interest/100;
        booking = new BookingDTO(request.getBooking());
        response = responseStatus;
    }
}
