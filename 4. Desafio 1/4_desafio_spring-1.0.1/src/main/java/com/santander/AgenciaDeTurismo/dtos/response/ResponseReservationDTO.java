package com.santander.AgenciaDeTurismo.dtos.response;

import com.santander.AgenciaDeTurismo.dtos.ReservationDTO;
import com.santander.AgenciaDeTurismo.dtos.ResponseStatusDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestReservationDTO;
import com.santander.AgenciaDeTurismo.models.Vuelo;
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
