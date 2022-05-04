package com.desafioSpring.desafio_spring.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PayloadHotelesDto {

    //se utiliza para cargar un payloads
    private String userName;
    private BookingDto booking;

}
