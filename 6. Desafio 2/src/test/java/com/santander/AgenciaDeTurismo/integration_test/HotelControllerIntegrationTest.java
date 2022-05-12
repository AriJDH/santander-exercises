package com.santander.AgenciaDeTurismo.integration_test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.santander.AgenciaDeTurismo.dtos.ErrorDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseHotelDTO;
import com.santander.AgenciaDeTurismo.models.Hotel;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.LinkedList;
import java.util.List;

import static com.santander.AgenciaDeTurismo.utils.HotelFactory.*;
import static com.santander.AgenciaDeTurismo.utils.HotelFactory.hotelListValid;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HotelControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;


    @Test
    @Order(1)
    public void integrationTestGetHotels() throws Exception {

        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .writer();

        // arrange

        List<ResponseHotelDTO> responseListaHotelesDTO = new LinkedList<>();
        for (Hotel hotel : loadDataBaseHoteles()) {
            responseListaHotelesDTO.add(new ResponseHotelDTO(hotel));
        }

        String responseBody = writer.writeValueAsString(responseListaHotelesDTO);


        responseBody = responseBody.replace("\":[", "\":\"");
        responseBody = responseBody.replace("],\"", "\",\"");

        responseBody = responseBody.replace("22,", "22-");
        responseBody = responseBody.replace("22-1,", "22-01-");
        responseBody = responseBody.replace("22-2,", "22-02-");
        responseBody = responseBody.replace("2022-01-2\"", "2022-01-02\"");
        responseBody = responseBody.replace("22-3,", "22-03-");
        responseBody = responseBody.replace("22-03-1\"", "22-03-01\"");
        responseBody = responseBody.replace("22-4,", "22-04-");
        responseBody = responseBody.replace("22-5,", "22-05-");
        responseBody = responseBody.replace("22-6,", "22-06-");
        responseBody = responseBody.replace("22-7,", "22-07-");
        responseBody = responseBody.replace("22-8,", "22-08-");
        responseBody = responseBody.replace("22-9,", "22-09-");
        responseBody = responseBody.replace("22-10,", "22-10-");
        responseBody = responseBody.replace("22-11,", "22-11-");


        System.out.println("\n\n\n\n" + responseBody + "\n\n\n\n");

        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(responseBody);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/api/v1/hotels");

        // act & assert
        mockMvc
                .perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(
                        expectedStatus,
                        expectedJson,
                        expectedContentType
                );

    }


    @Test
    @Order(2)
    public void integrationTestGetFilteredHotels() throws Exception {

        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .writer();

        // arrange

        String responseBody = writer.writeValueAsString(hotelListValid());


        responseBody = responseBody.replace("\":[", "\":\"");
        responseBody = responseBody.replace("],\"", "\",\"");

        responseBody = responseBody.replace("22,", "22-");
        responseBody = responseBody.replace("22-2,", "22-02-");
        responseBody = responseBody.replace("22-3,", "22-03-");

        System.out.println(responseBody);
        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(responseBody);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/api/v1/hotels/")
                .param("dateFrom", "12/02/2022")
                .param("dateTo", "19/03/2022")
                .param("destination", "Puerto Iguazú");

        // act & assert
        mockMvc
                .perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(
                        expectedStatus,
                        expectedJson,
                        expectedContentType
                );

    }
    @Test
    @Order(3)
    public void integrationTestGetFilteredHotelsDateInvalid() throws Exception {

        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .writer();

        // arrange

        String responseBody = writer.writeValueAsString(new ErrorDTO(400,"Error en el ingreso de datos","La fecha ingresada es invalida, porfavor ingrese una fecha con el siguiente formato dd/mm/yyyy"));



        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isBadRequest();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(responseBody);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        System.out.println(expectedJson);
        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/api/v1/hotels/")
                .param("dateFrom", "122/02/2022")
                .param("dateTo", "19/03/2022")
                .param("destination", "Puerto Iguazú");

        // act & assert
        mockMvc
                .perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(
                        expectedStatus,
                        expectedContentType
                );

    }


    @Test
    @Order(4)
    public void integrationTestBooking() throws Exception {

        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .writer();

        // arrange
        String responseBody = writer.writeValueAsString(responseBookingDTOValid());
        String requestBody = writer.writeValueAsString(requestBookingDTOValid());

        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(responseBody);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/api/v1/booking").contentType(MediaType.APPLICATION_JSON).content(requestBody);

        // act & assert
        mockMvc
                .perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(
                        expectedStatus,
                        expectedJson,
                        expectedContentType
                );

    }
}






