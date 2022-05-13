package com.santanderbootcamp.desafio_spring.integration_test;

import com.santanderbootcamp.desafio_spring.dto.VuelosDto;
import com.santanderbootcamp.desafio_spring.mapper.VuelosMapper;
import com.santanderbootcamp.desafio_spring.utils.ClientesFactory;
import com.santanderbootcamp.desafio_spring.utils.VuelosFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.DisplayName;
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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class VuelosControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("Testing de Controller para obtener un listado los vuelos")
    void getVuelosRegistrados() throws Exception {
        VuelosMapper mapper = new VuelosMapper();
        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule()) // convertir fechas
                .writer();

        // arrange

        List<VuelosDto> vuelosDtos = VuelosFactory.listaVuelos().stream().map(mapper::toDto).collect(Collectors.toList());
        String listJson = writer.writeValueAsString(vuelosDtos);

        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(listJson);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = get("/api/v1/flights");

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
    @DisplayName("Testing de Controller para obtener un listado de vuelos por fecha y destino")
    void getVuelosPorFechaYDestino() throws Exception {
        VuelosMapper mapper = new VuelosMapper();
        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule()) // convertir fechas
                .writer();

        // arrange

        List<VuelosDto> vuelosDto = new ArrayList<>(){{add(mapper.toDto(VuelosFactory.getVuelos()));}};
        String listJson = writer.writeValueAsString(vuelosDto);

        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(listJson);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = get("/api/v1/flights")
                .param("dateFrom", "10/02/2022")
                .param("dateTo", "15/02/2022")
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
    @DisplayName("Se registra un cliente al reservar un vuelo y se devuelve el monto a pagar.")
    void registrarClientesVuelo() throws Exception {
        VuelosMapper mapper = new VuelosMapper();
        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule()) // convertir fechas
                .writer();

        // arrange

        String expectedPayloadJson = writer.writeValueAsString(ClientesFactory.getResponsePayloadVuelos());
        String payloadJson = writer.writeValueAsString(ClientesFactory.getPayloadVuelos());

        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(expectedPayloadJson);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/api/v1/flight-reservation")
                .contentType(MediaType.APPLICATION_JSON)
                .content(payloadJson);
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

