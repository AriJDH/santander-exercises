package com.santander.DesafioSpring.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestHotelFechaDestinoDecoyDTO {

    private String destination;
    private String dateFrom;
    private String dateTo;
}
