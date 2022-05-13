package com.santanderbootcamp.desafio_spring.utils;

import com.santanderbootcamp.desafio_spring.dto.StatusDto;
import com.santanderbootcamp.desafio_spring.dto.request.BookingDto;
import com.santanderbootcamp.desafio_spring.dto.request.FlightReservationDto;
import com.santanderbootcamp.desafio_spring.dto.request.PayloadHotelesDto;
import com.santanderbootcamp.desafio_spring.dto.request.PayloadVuelosDto;
import com.santanderbootcamp.desafio_spring.dto.response.ResponseBookingDto;
import com.santanderbootcamp.desafio_spring.dto.response.ResponseFlightReservationDto;
import com.santanderbootcamp.desafio_spring.dto.response.ResponsePayloadHotelesDto;
import com.santanderbootcamp.desafio_spring.dto.response.ResponsePayloadVuelosDto;
import com.santanderbootcamp.desafio_spring.modelos.PaymentMethod;
import com.santanderbootcamp.desafio_spring.modelos.Personas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ClientesFactory {

    public static PayloadHotelesDto getPayloadHoteles(){
        Personas persona1 = new Personas(
                "3444444",
                "Pepito",
                "Gomez",
                "10/11/1982",
                "mail@gmail.com"
        );
        Personas persona2 = new Personas(
                "87654321",
                "Joerge",
                "Gomez",
                "03/03/1978",
                "mail@gmail.com"
        );
        List<Personas> listaPersona = new ArrayList<>() {{add(persona1);add(persona2);}};
        PaymentMethod paymentMethod = new PaymentMethod(
                "CREDIT",
                "1234-1234-1234-1234",
                6
        );
        BookingDto booking = new BookingDto(
                LocalDate.parse("10/02/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                LocalDate.parse("22/03/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                "Puerto Iguazú",
                "CH-0002",
                2,
                "Doble",
                listaPersona,
                paymentMethod
        );
        return new PayloadHotelesDto(
                "compra_el_elden@ring.com",
                booking
                );
    }


    public static ResponsePayloadHotelesDto getResponsePayloadHoteles(){
        Personas persona1 = new Personas(
                "3444444",
                "Pepito",
                "Gomez",
                "10/11/1982",
                "mail@gmail.com"
        );
        Personas persona2 = new Personas(
                "87654321",
                "Joerge",
                "Gomez",
                "03/03/1978",
                "mail@gmail.com"
        );
        List<Personas> listaPersona = new ArrayList<>() {{add(persona1);add(persona2);}};
        StatusDto status = new StatusDto(200, "El proceso termino satisfactoriamente");
        ResponseBookingDto booking = new ResponseBookingDto(
                LocalDate.parse("10/02/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                LocalDate.parse("22/03/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                "Puerto Iguazú",
                "CH-0002",
                2,
                "Doble",
                listaPersona
        );
        return new ResponsePayloadHotelesDto(
                "compra_el_elden@ring.com",
                252000.0,
                1.1,
                277200.0,
                booking,
                status
        );
    }

    public static PayloadVuelosDto getPayloadVuelos(){
        Personas persona1 = new Personas(
                "3444444",
                "Pepito",
                "Gomez",
                "10/11/1982",
                "mail@gmail.com"
        );
        Personas persona2 = new Personas(
                "87654321",
                "Joerge",
                "Gomez",
                "03/03/1978",
                "mail@gmail.com"
        );
        List<Personas> listaPersona = new ArrayList<>() {{add(persona1);add(persona2);}};
        PaymentMethod paymentMethod = new PaymentMethod(
                "CREDIT",
                "1234-1234-1234-1234",
                6
        );
        FlightReservationDto flightReservation = new FlightReservationDto(
                LocalDate.parse("10/02/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                LocalDate.parse("15/02/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                "Buenos Aires",
                "Puerto Iguazú",
                "BAPI-1235",
                2,
                "Economy",
                listaPersona,
                paymentMethod
        );
        return new PayloadVuelosDto(
                "compra_el_elden@ring.com",
                flightReservation
                );
    }

    public static ResponsePayloadVuelosDto getResponsePayloadVuelos(){
        Personas persona1 = new Personas(
                "3444444",
                "Pepito",
                "Gomez",
                "10/11/1982",
                "mail@gmail.com"
        );
        Personas persona2 = new Personas(
                "87654321",
                "Joerge",
                "Gomez",
                "03/03/1978",
                "mail@gmail.com"
        );
        List<Personas> listaPersona = new ArrayList<>() {{add(persona1);add(persona2);}};
        ResponseFlightReservationDto flightReservation = new ResponseFlightReservationDto(
                LocalDate.parse("10/02/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                LocalDate.parse("15/02/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                "Buenos Aires",
                "Puerto Iguazú",
                "BAPI-1235",
                2,
                "Economy",
                listaPersona
        );
        StatusDto status = new StatusDto(200, "El proceso termino satisfactoriamente");
        return new ResponsePayloadVuelosDto(
                "compra_el_elden@ring.com",
                13000.0,
                1.1,
                14300.000000000002,
                flightReservation,
                status
        );
    }

}
