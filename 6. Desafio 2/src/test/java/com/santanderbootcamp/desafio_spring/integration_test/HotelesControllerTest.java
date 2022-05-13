package com.santanderbootcamp.desafio_spring.integration_test;

import com.santanderbootcamp.desafio_spring.dto.HotelesDto;
import com.santanderbootcamp.desafio_spring.dto.StatusDto;
import com.santanderbootcamp.desafio_spring.mapper.HotelesMapper;
import com.santanderbootcamp.desafio_spring.utils.ClientesFactory;
import com.santanderbootcamp.desafio_spring.utils.HotelesFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
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
class HotelesControllerTest {

    @Autowired
    MockMvc mockMvc;


    @Test
    @DisplayName("Testing de Controller para obtener un listado los hoteles")
    void getHotelesRegistrados() throws Exception {
        HotelesMapper mapper = new HotelesMapper();
        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule()) // convertir fechas
                .writer();

        // `.   ( ͡ಥ ͜ʖ ͡ಥ)
        List<HotelesDto> hotelesDto = HotelesFactory.listaHoteles().stream().map(mapper::toDto).collect(Collectors.toList());
        String listJson = writer.writeValueAsString(hotelesDto);

        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(listJson);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = get("/api/v1/hotels");

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
    @DisplayName("Testing de Controller para obtener un listado de hoteles por fecha y destino")
    void getHotelesDisponiblesPorFechaYDestino() throws Exception {
        HotelesMapper mapper = new HotelesMapper();
        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule()) // convertir fechas
                .writer();

        // arrange
        List<HotelesDto> hotelesDto = new ArrayList<>();
        hotelesDto.add(mapper.toDto(HotelesFactory.getHotel2()));
        String listJson = writer.writeValueAsString(hotelesDto);

        System.out.println(listJson);

        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(listJson);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = get("/api/v1/hotels")
                .param("dateFrom", "11/03/2022")
                .param("dateTo", "23/04/2022")
                .param("destination", "Buenos Aires");

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



    @Nested
    class context1 {
        @Test
        @DisplayName("Testing de Controller para reservar un hotel por método post")
        void registrarClientesHotel() throws Exception {
            HotelesMapper mapper = new HotelesMapper();
            ObjectWriter writer = new ObjectMapper()
                    .registerModule(new JavaTimeModule()) // convertir fechas
                    .writer();

            // arrange

            String expectedPayloadJson = writer.writeValueAsString(ClientesFactory.getResponsePayloadHoteles());
            String payloadJson = writer.writeValueAsString(ClientesFactory.getPayloadHoteles());

            // EXPECTED
            ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
            ResultMatcher expectedJson = MockMvcResultMatchers.content().json(expectedPayloadJson);
            ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

            // REQUEST
            MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/api/v1/booking")
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

        @Test
        @DisplayName("Testing de Controller para reservar un hotel con error de fecha")
        void registrarClientesHotelConErrorDeFecha() throws Exception {
            HotelesMapper mapper = new HotelesMapper();
            ObjectWriter writer = new ObjectMapper()
                    .registerModule(new JavaTimeModule()) // convertir fechas
                    .writer();

            // arrange
            String payloadJson = writer.writeValueAsString(ClientesFactory.getPayloadHoteles());
            String payloadConError = payloadJson.replace("10/02/2022", "10/09/2022"); // reemplaza el dateFrom
            StatusDto statusDto = new StatusDto(404,"La fecha de entrada es mayor a la fecha de salida");
            String expected = writer.writeValueAsString(statusDto);

            // EXPECTED
            ResultMatcher expectedStatus = MockMvcResultMatchers.status().isBadRequest();
            ResultMatcher expectedJson = MockMvcResultMatchers.content().json(expected);
            ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

            // REQUEST
            MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/api/v1/booking")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(payloadConError);
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
        @DisplayName("Testing de Controller para reservar un hotel con error de cuartos")
        void registrarClientesHotelConErrorDeCuartos() throws Exception {
            HotelesMapper mapper = new HotelesMapper();
            ObjectWriter writer = new ObjectMapper()
                    .registerModule(new JavaTimeModule()) // convertir fechas
                    .writer();

            // arrange
            String payloadJson = writer.writeValueAsString(ClientesFactory.getPayloadHoteles());
            String payloadConError = payloadJson.replace("Doble", "Single"); // reemplaza el Doble por Single -- mucho espanglish
            StatusDto statusDto = new StatusDto(404,"El tipo de habitación no coincide con la cantidad de personas.");
            String expected = writer.writeValueAsString(statusDto);

            // EXPECTED
            ResultMatcher expectedStatus = MockMvcResultMatchers.status().isBadRequest();
            ResultMatcher expectedJson = MockMvcResultMatchers.content().json(expected);
            ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

            // REQUEST
            MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/api/v1/booking")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(payloadConError);
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
}

