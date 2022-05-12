package com.santanderbootcamp.desafio_spring.unit_test.service;

import com.santanderbootcamp.desafio_spring.dto.VuelosDto;
import com.santanderbootcamp.desafio_spring.dto.request.PayloadVuelosDto;
import com.santanderbootcamp.desafio_spring.dto.response.ResponsePayloadVuelosDto;
import com.santanderbootcamp.desafio_spring.excepciones.VuelosException;
import com.santanderbootcamp.desafio_spring.mapper.VuelosMapper;
import com.santanderbootcamp.desafio_spring.modelos.Vuelos;
import com.santanderbootcamp.desafio_spring.repo.Dao;
import com.santanderbootcamp.desafio_spring.service.VuelosService;
import com.santanderbootcamp.desafio_spring.utils.ClientesFactory;
import com.santanderbootcamp.desafio_spring.utils.VuelosFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class VuelosServiceTest {
    @Mock
    Dao<String, Vuelos> vuelosDaoJson;

    @Spy
    VuelosMapper mapper;

    @InjectMocks
    VuelosService vuelosService;

    @Test
    @DisplayName("Se envía solicitud de listado de todos los vuelos registrados.")

    void getListadoVuelos(){
        //arr
        List<Vuelos> expected = VuelosFactory.listaVuelos(); //Este devuelve Vuelos
        List<VuelosDto> vuelosDtos = expected.stream().map(mapper::toDto).collect(Collectors.toList());

        //MOCK
        when(vuelosDaoJson.getElementos()).thenReturn(expected); // Este deuvelve Vuelos

        //act
        List<VuelosDto> vuelosDTODevueltos = vuelosService.getElementos();

        //assert
        assertEquals(vuelosDtos,vuelosDTODevueltos);
    }


    @Test
    @DisplayName("lista elementos por fecha y destino")
    void getElementosDisponiblesPorFechaYDestinoTest(){
        //arrange
        List<VuelosDto> expected = new ArrayList<>();
        expected.add(mapper.toDto(VuelosFactory.getVuelos()));
        String desde = "10/02/2022";
        String hasta = "20/03/2022";
        String destino  = "Puerto Iguazú";

        //act
        when(vuelosDaoJson.getElementos()).thenReturn(VuelosFactory.listaVuelos());
        List<VuelosDto> vuelosDevueltos = vuelosService.getElementosDisponiblesPorFechaYDestino(desde,hasta,destino);

        //assert
        Assertions.assertEquals(expected,vuelosDevueltos);
    }
    @Test
    @DisplayName("lista elementos por fecha y destino con lista vacía")
    void getElementosDisponiblesPorFechaYDestinoTestError(){
        //arrange
        String desde = "10/02/2022";
        String hasta = "15/02/2022";
        String destino  = "Puerto Iguazú";
        String expectedMessage = "No hay vuelos disponibles";

        //act
        when(vuelosDaoJson.getElementos()).thenReturn(new ArrayList<>());
        Exception e = Assertions.assertThrows(VuelosException.class,() ->{
            vuelosService.getElementosDisponiblesPorFechaYDestino(desde,hasta,destino);
        });

        //assert
        Assertions.assertEquals(expectedMessage,e.getMessage());
    }

    @Test
    @DisplayName("Registrar y mostrar los clientes testing")
    void registrarYMostrarTest(){

        //arrange
        PayloadVuelosDto cliente = ClientesFactory.getPayloadVuelos();
        ResponsePayloadVuelosDto reservaEsperada = ClientesFactory.getResponsePayloadVuelos();
        //act

        when(vuelosDaoJson.getElementos()).thenReturn(VuelosFactory.listaVuelos());
        ResponsePayloadVuelosDto reservaObtenida = vuelosService.registrarYMostrarCliente(cliente);

        //assert
        Assertions.assertEquals(reservaEsperada,reservaObtenida);
    }

    @Test
    @DisplayName("Registrar y mostrar los clientes testing")
    void registrarYMostrarTestError(){

        //arrange
        PayloadVuelosDto cliente = ClientesFactory.getPayloadVuelos();
        String expectedMessage = "El vuelo no existe";
        cliente.getFlightReservation().setFlightNumber("ABC");
        //act
        when(vuelosDaoJson.getElementos()).thenReturn(VuelosFactory.listaVuelos());
        Exception e = Assertions.assertThrows(VuelosException.class,() ->{

            vuelosService.registrarYMostrarCliente(cliente);
        });

        //assert
        Assertions.assertEquals(expectedMessage,e.getMessage());
    }

}