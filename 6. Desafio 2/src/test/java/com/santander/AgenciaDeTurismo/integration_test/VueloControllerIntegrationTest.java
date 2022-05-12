package com.santander.AgenciaDeTurismo.integration_test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseHotelDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseVueloDTO;
import com.santander.AgenciaDeTurismo.models.Hotel;
import com.santander.AgenciaDeTurismo.models.Vuelo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.LinkedList;
import java.util.List;

import static com.santander.AgenciaDeTurismo.utils.HotelFactory.*;
import static com.santander.AgenciaDeTurismo.utils.VueloFactory.*;

@SpringBootTest
@AutoConfigureMockMvc
public class VueloControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void integrationTestGetFilteredFlights() throws Exception {

        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .writer();

        // arrange

        List<ResponseVueloDTO> responseListaHotelesDTO = new LinkedList<>();

        responseListaHotelesDTO.add(new ResponseVueloDTO(vueloValid()));

        String responseBody = writer.writeValueAsString(responseListaHotelesDTO);



        responseBody = responseBody.replace("\":[", "\":\"");
        responseBody = responseBody.replace("],\"", "\",\"");

        responseBody = responseBody.replace("22,", "22-");
        responseBody = responseBody.replace("22-1,", "22-01-");
        responseBody = responseBody.replace("22-2,", "22-02-");
        responseBody = responseBody.replace("22-02-15]", "22-02-15\"");



        System.out.println("\n\n\n\n" + responseBody + "\n\n\n\n");

        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(responseBody);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/api/v1/flights/")
                .param("dateFrom", "10/02/2022")
                .param("dateTo", "15/02/2022")
                .param("destination", "Puerto Iguazú")
                .param("origin","Buenos Aires");

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
    public void integrationTestGetFlights() throws Exception {

        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .writer();

        // arrange

        List<ResponseVueloDTO> responseListaVuelosDTO = new LinkedList<>();
        for (Vuelo vuelo : loadDataBaseVuelos()) {
            responseListaVuelosDTO.add(new ResponseVueloDTO(vuelo));
        }

        String responseBody = writer.writeValueAsString(responseListaVuelosDTO);


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

        responseBody = responseBody.replace("]},", "\"},");
        responseBody = responseBody.replace("]}]", "\"}]");
        responseBody = responseBody.replace("-5\"}", "-05\"}");
        responseBody = responseBody.replace("-2\"}", "-02\"}");




        System.out.println("\n\n\n\n" + responseBody + "\n\n\n\n");

        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(responseBody);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/api/v1/flights");

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
    public void integrationTestReservation() throws Exception {

        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .writer();

        // arrange
        String responseBody = writer.writeValueAsString(responseReservationDTOValid());
        String requestBody = writer.writeValueAsString(requestVueloDTOValid());

        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(responseBody);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/api/v1/flight-reservation").contentType(MediaType.APPLICATION_JSON).content(requestBody);

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