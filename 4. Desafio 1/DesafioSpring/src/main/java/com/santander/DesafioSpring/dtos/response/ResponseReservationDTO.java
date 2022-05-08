package com.santander.DesafioSpring.dtos.response;

import com.santander.DesafioSpring.dtos.ReservationDTO;
import com.santander.DesafioSpring.dtos.ResponseStatusDTO;
import com.santander.DesafioSpring.dtos.request.RequestReservationDTO;
import com.santander.DesafioSpring.models.Vuelo;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseReservationDTO {

    private String userName;
    private double amount;
    private double interest;
    private double total;
    private ReservationDTO flightReservation;
    private ResponseStatusDTO response;

    public ResponseReservationDTO(RequestReservationDTO request, Vuelo vuelo, ResponseStatusDTO responseStatus) {
        userName = request.getUserName();
        amount = vuelo.getPrice();
        interest = 21;
        total = amount + amount*interest/100;
        flightReservation = new ReservationDTO(request.getFlightReservation());
        response = responseStatus;
    }


}
