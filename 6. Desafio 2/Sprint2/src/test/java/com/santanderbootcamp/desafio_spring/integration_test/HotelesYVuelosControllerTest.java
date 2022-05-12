package com.santanderbootcamp.desafio_spring.integration_test;

import com.santanderbootcamp.desafio_spring.mapper.HotelesMapper;
import com.santanderbootcamp.desafio_spring.mapper.VuelosMapper;
import com.santanderbootcamp.desafio_spring.utils.HotelesFactory;
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
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@SpringBootTest
@AutoConfigureMockMvc
class HotelesYVuelosControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("Testing de Controller para obtener un listado de hoteles por fecha y destino")
    void getHotelesDisponiblesPorFechaYDestino() throws Exception {
        HotelesMapper mapperHotel = new HotelesMapper();
        VuelosMapper mapperVuelo = new VuelosMapper();
        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule()) // convertir fechas
                .writer();

        // arrange
        List<Object> vuelosYHotelesDto = new ArrayList<>();
        vuelosYHotelesDto.add(mapperVuelo.toDto(VuelosFactory.getVuelos3()));
        vuelosYHotelesDto.add(mapperHotel.toDto(HotelesFactory.getHotel2()));
        String listJson = writer.writeValueAsString(vuelosYHotelesDto);

        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(listJson);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = get("/api/v1/bookingandflights")
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


}