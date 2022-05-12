package com.santander.AgenciaDeTurismo.utils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.santander.AgenciaDeTurismo.dtos.*;
import com.santander.AgenciaDeTurismo.dtos.request.RequestBookingDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestReservationDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseBookingDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseHotelDTO;
import com.santander.AgenciaDeTurismo.models.Hotel;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HotelFactory {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public static Hotel hotelValid() {
        Hotel hotel = new Hotel();
        hotel.setHotelCode("CH-0002");
        hotel.setName("Cataratas Hotel");
        hotel.setDestination("Puerto Iguazú");
        hotel.setRoomType("DOUBLE");
        hotel.setPrice(6300);
        hotel.setDateFrom(LocalDate.parse("10/02/2022", formatter));
        hotel.setDateTo(LocalDate.parse("20/03/2022", formatter));
        hotel.setReserved(false);
        return hotel;
    }
    public static Hotel hotelValid2() {
        Hotel hotel = new Hotel();
        hotel.setHotelCode("CH-0003");
        hotel.setName("Cataratas Hotel 2");
        hotel.setDestination("Puerto Iguazú");
        hotel.setRoomType("TRIPLE");
        hotel.setPrice(8200);
        hotel.setDateFrom(LocalDate.parse("10/02/2022", formatter));
        hotel.setDateTo(LocalDate.parse("23/03/2022", formatter));
        hotel.setReserved(false);
        return hotel;
    }
    public static List<ResponseHotelDTO> hotelListValid(){
        List<ResponseHotelDTO> hotelList= new LinkedList<>();
        hotelList.add( new ResponseHotelDTO(hotelValid()));
        hotelList.add( new ResponseHotelDTO(hotelValid2()));
        return hotelList;
    }

    public static List<Hotel> loadDataBaseHoteles() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:hoteles.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Hotel>> typeRef = new TypeReference<>() {};
        List<Hotel> hotelesAGuardar = null;
        try {
            hotelesAGuardar = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hotelesAGuardar;
    }

    public static RequestBookingDTO requestBookingDTOValid(){
        RequestBookingDTO requestBookingDTO= new RequestBookingDTO(
                "arjonamiguel@gmail.com",
                new BookingCreditCardDTO(
                        (LocalDate.parse("10/02/2022",formatter)),
                        (LocalDate.parse("20/03/2022",formatter)),
                        "Puerto Iguazú",
                        "CH-0002",
                        2,
                        "DOUBLE",
                        Arrays.asList(
                                new PersonaDTO(
                                        "12345678",
                                        "Pepito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1982",formatter)),
                                        "arjonamiguel@gmail.com"
                                ),
                                new PersonaDTO(
                                        "13345678",
                                        "Fulanito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1983",formatter)),
                                        "arjonamigue12@gmail.com"
                                )
                        ),
                        new CreditCardDTO(
                                "CREDIT",
                                "1234-1234-1234-1234",
                                6
                        )
                )
        );
        return requestBookingDTO;
    }
    public static RequestBookingDTO requestBookingDTOInvalidPeopleAmount(){
        RequestBookingDTO requestBookingDTO= new RequestBookingDTO(
                "arjonamiguel@gmail.com",
                new BookingCreditCardDTO(
                        (LocalDate.parse("10/02/2022",formatter)),
                        (LocalDate.parse("20/03/2022",formatter)),
                        "Buenos Aires",
                        "CH-0002",
                        6,
                        "DOUBLE",
                        Arrays.asList(
                                new PersonaDTO(
                                        "12345678",
                                        "Pepito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1982",formatter)),
                                        "arjonamiguel@gmail.com"
                                ),
                                new PersonaDTO(
                                        "13345678",
                                        "Fulanito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1983",formatter)),
                                        "arjonamigue12@gmail.com"
                                )
                        ),
                        new CreditCardDTO(
                                "CREDIT",
                                "1234-1234-1234-1234",
                                6
                        )
                )
        );
        return requestBookingDTO;
    }


    public static ResponseBookingDTO responseBookingDTOValid(){
        ResponseBookingDTO responseBookingDTO=
                new ResponseBookingDTO(
                    "arjonamiguel@gmail.com",
                    6300.0,
                    10.0,
                    6930.0,
                    new BookingDTO(
                            (LocalDate.parse("10/02/2022",formatter)),
                            (LocalDate.parse("20/03/2022",formatter)),
                            "Puerto Iguazú",
                            "CH-0002",
                            2,
                            "DOUBLE",
                            Arrays.asList(
                                    new PersonaDTO(
                                            "12345678",
                                            "Pepito",
                                            "Gomez",
                                            (LocalDate.parse("10/11/1982",formatter)),
                                            "arjonamiguel@gmail.com"
                                    ),
                                    new PersonaDTO(
                                            "13345678",
                                            "Fulanito",
                                            "Gomez",
                                            (LocalDate.parse("10/11/1983",formatter)),
                                            "arjonamigue12@gmail.com"
                                    )
                            )
                    ),
                    new ResponseStatusDTO(
                            200,
                            "La reserva fue hecha con exito"
                    )

        );
        return responseBookingDTO;
    }
    }

