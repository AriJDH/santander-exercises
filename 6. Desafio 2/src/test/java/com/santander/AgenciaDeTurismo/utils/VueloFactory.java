package com.santander.AgenciaDeTurismo.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.santander.AgenciaDeTurismo.dtos.*;
import com.santander.AgenciaDeTurismo.dtos.request.RequestReservationDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestVueloDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestVueloDecoyDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseReservationDTO;
import com.santander.AgenciaDeTurismo.models.Hotel;
import com.santander.AgenciaDeTurismo.models.Vuelo;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VueloFactory {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public static Vuelo vueloValid() {
        Vuelo vuelo = new Vuelo(
                "BAPI-1235",
                "Buenos Aires",
                "Puerto Iguazú",
                "ECONOMY",
                6500,
                LocalDate.parse("10/02/2022", formatter),
                LocalDate.parse("15/02/2022", formatter)
        );
        return vuelo;
    }

    public static RequestVueloDecoyDTO requestVueloDecoyDTO() {
        return new RequestVueloDecoyDTO("Buenos Aires","Puerto Iguazú","10/02/2022","15/02/2022");
    }

    public static RequestVueloDecoyDTO requestVueloDecoyDTOFechaInvalida() {
        return new RequestVueloDecoyDTO("Buenos Aires","Puerto Iguazú","2022/07/23","15/02/2022");
    }

    public static Vuelo vueloInvalid() {
        Vuelo vuelo = new Vuelo(
                "NARA-7563",
                "Cordoba",
                "Puerto",
                "Economy",
                6500,
                LocalDate.parse("10/02/2022", formatter),
                LocalDate.parse("15/02/2022", formatter)
        );
        return vuelo;
    }

    public static RequestReservationDTO requestVueloDTOValid() {
        RequestReservationDTO requestVueloDTO = new RequestReservationDTO(
                "arjonamiguel@gmail.com",
                new ReservationCreditCardDTO(
                        LocalDate.parse("10/02/2022", formatter),
                        LocalDate.parse("15/02/2022", formatter),
                        "Buenos Aires",
                        "Puerto Iguazú",
                        "BAPI-1235",
                        2,
                        "ECONOMY",
                        Arrays.asList(
                                new PersonaDTO(
                                        "12345678",
                                        "Pepito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1982", formatter)),
                                        "arjonamiguel@gmail.com"
                                ),
                                new PersonaDTO(
                                        "13345678",
                                        "Fulanito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1983", formatter)),
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
        return requestVueloDTO;
    }

    public static RequestReservationDTO requestVueloDTOInvalidDates() {
        RequestReservationDTO requestVueloDTO = new RequestReservationDTO(
                "arjonamiguel@gmail.com",
                new ReservationCreditCardDTO(
                        LocalDate.parse("11/01/2022", formatter),
                        LocalDate.parse("20/11/2022", formatter),
                        "Buenos Aires",
                        "Puerto Iguazú",
                        "BAPI-1235",
                        2,
                        "ECONOMY",
                        Arrays.asList(
                                new PersonaDTO(
                                        "12345678",
                                        "Pepito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1982", formatter)),
                                        "arjonamiguel@gmail.com"
                                ),
                                new PersonaDTO(
                                        "13345678",
                                        "Fulanito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1983", formatter)),
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
        return requestVueloDTO;
    }

    public static RequestReservationDTO requestVueloDTOInvalidFlightNumber() {
        RequestReservationDTO requestVueloDTO = new RequestReservationDTO(
                "arjonamiguel@gmail.com",
                new ReservationCreditCardDTO(
                        LocalDate.parse("10/02/2022", formatter),
                        LocalDate.parse("20/11/2022", formatter),
                        "Buenos Aires",
                        "Puerto Iguazú",
                        "3141-TASSD",
                        2,
                        "ECONOMY",
                        Arrays.asList(
                                new PersonaDTO(
                                        "12345678",
                                        "Pepito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1982", formatter)),
                                        "arjonamiguel@gmail.com"
                                ),
                                new PersonaDTO(
                                        "13345678",
                                        "Fulanito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1983", formatter)),
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
        return requestVueloDTO;
    }

    public static RequestReservationDTO requestVueloDTOInvalidDateFormat() {
        RequestReservationDTO requestVueloDTO = new RequestReservationDTO(
                "arjonamiguel@gmail.com",
                new ReservationCreditCardDTO(
                        LocalDate.parse("110/02/2022", formatter),
                        LocalDate.parse("120/11/2022", formatter),
                        "Buenos Aires",
                        "Puerto Iguazú",
                        "BAPI-1235",
                        2,
                        "ECONOMY",
                        Arrays.asList(
                                new PersonaDTO(
                                        "12345678",
                                        "Pepito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1982", formatter)),
                                        "arjonamiguel@gmail.com"
                                ),
                                new PersonaDTO(
                                        "13345678",
                                        "Fulanito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1983", formatter)),
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
        return requestVueloDTO;
    }

    public static RequestReservationDTO requestVueloDTOInvalidBreaksSpaceAndTime() {
        RequestReservationDTO requestVueloDTO = new RequestReservationDTO(
                "arjonamiguel@gmail.com",
                new ReservationCreditCardDTO(
                        LocalDate.parse("21/02/2022", formatter),
                        LocalDate.parse("20/01/2022", formatter),
                        "Buenos Aires",
                        "Puerto Iguazú",
                        "BAPI-1235",
                        2,
                        "ECONOMY",
                        Arrays.asList(
                                new PersonaDTO(
                                        "12345678",
                                        "Pepito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1982", formatter)),
                                        "arjonamiguel@gmail.com"
                                ),
                                new PersonaDTO(
                                        "13345678",
                                        "Fulanito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1983", formatter)),
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
        return requestVueloDTO;
    }

    public static ResponseReservationDTO responseReservationDTOValid() {
        ResponseReservationDTO reservationDTO = new ResponseReservationDTO(
                "arjonamiguel@gmail.com",
                6500.0,
                10.0,
                7150.0,
                new ReservationDTO(
                        LocalDate.parse("10/02/2022", formatter),
                        LocalDate.parse("15/02/2022", formatter),
                        "Buenos Aires",
                        "Puerto Iguazú",
                        "BAPI-1235",
                        2,
                        "ECONOMY",
                        Arrays.asList(
                                new PersonaDTO(
                                        "12345678",
                                        "Pepito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1982", formatter)),
                                        "arjonamiguel@gmail.com"
                                ),
                                new PersonaDTO(
                                        "13345678",
                                        "Fulanito",
                                        "Gomez",
                                        (LocalDate.parse("10/11/1983", formatter)),
                                        "arjonamigue12@gmail.com"
                                )
                        )

                ),
                new ResponseStatusDTO(
                        200,
                        "La reserva fue hecha con exito"
                )

        );
        return reservationDTO;
    }

    public static List<Vuelo> loadDataBaseVuelos() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:vuelos.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Vuelo>> typeRef = new TypeReference<>() {};
        List<Vuelo> vuelosAGuardar = null;
        try {
            vuelosAGuardar = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vuelosAGuardar;
    }
}

