
package com.santanderbootcamp.desafio_spring.unit_test.service;

import com.santanderbootcamp.desafio_spring.dto.HotelesDto;
import com.santanderbootcamp.desafio_spring.dto.request.PayloadHotelesDto;
import com.santanderbootcamp.desafio_spring.dto.response.ResponsePayloadHotelesDto;
import com.santanderbootcamp.desafio_spring.excepciones.FechasNoValidasException;
import com.santanderbootcamp.desafio_spring.excepciones.HotelesException;
import com.santanderbootcamp.desafio_spring.mapper.HotelesMapper;
import com.santanderbootcamp.desafio_spring.modelos.Hoteles;
import com.santanderbootcamp.desafio_spring.repo.Dao;
import com.santanderbootcamp.desafio_spring.service.HotelesService;
import com.santanderbootcamp.desafio_spring.utils.ClientesFactory;
import com.santanderbootcamp.desafio_spring.utils.HotelesFactory;
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
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class HotelesServiceTest {

    @Mock
    Dao<String, Hoteles> hotelesDaoJson;

    @Spy
    HotelesMapper mapper;

    @InjectMocks
    HotelesService hotelesService;


    @Test
    @DisplayName("Se envía solicitud de listado de todos los hoteles registrados.")

    void getListadoHoteles(){
        //arr
        List<Hoteles> hoteles = HotelesFactory.listaHoteles(); //Este devuelve Hoteles
        List<HotelesDto> expected = hoteles.stream().map(mapper::toDto).collect(Collectors.toList());

        //MOCK
        when(hotelesDaoJson.getElementos()).thenReturn(hoteles); // Este deuvelve Hoteles

        //act
        List<HotelesDto> hotelesDTODevueltos = hotelesService.getElementos();

        //assert
        assertEquals(expected,hotelesDTODevueltos);
    }


    @Test
    @DisplayName("lista elementos por fecha y destino")
    void getElementosDisponiblesPorFechaYDestinoTest(){
        //arrange
        List<HotelesDto> expected = new ArrayList<>();
        expected.add(mapper.toDto(HotelesFactory.getHotel()));
        String desde = "10/02/2022";
        String hasta = "22/03/2022";
        String destino  = "Puerto Iguazú";

        //act
        when(hotelesDaoJson.getElementos()).thenReturn(HotelesFactory.listaHoteles());
        List<HotelesDto> hotelesDevueltos = hotelesService.getElementosDisponiblesPorFechaYDestino(desde,hasta,destino);

        //assert
        Assertions.assertEquals(expected,hotelesDevueltos);
    }
    @Test
    @DisplayName("lista elementos por fecha y destino con lista vacía")
    void getElementosDisponiblesPorFechaYDestinoTestError(){
        //arrange
        String desde = "10/02/2022";
        String hasta = "20/03/2022";
        String destino  = "Puerto Iguazú";
        String expectedMessage = "No hay hoteles disponibles en la fecha dada";

        //act
        when(hotelesDaoJson.getElementos()).thenReturn(new ArrayList<>());
        Exception e = Assertions.assertThrows(HotelesException.class,() ->{
            hotelesService.getElementosDisponiblesPorFechaYDestino(desde,hasta,destino);
        });

        //assert
        Assertions.assertEquals(expectedMessage,e.getMessage());
    }

    @Test
    @DisplayName("lista elementos por fecha y destino estan invertidas(error)")
    void getElementosDisponiblesPorFechaYDestinoTestError2(){
        //arrange
        String desde = "10/05/2022";
        String hasta = "20/03/2022";
        String destino  = "Puerto Iguazú";
        String expectedMessage = "La fecha de entrada debe ser mayor a la de salida";

        //act
        when(hotelesDaoJson.getElementos()).thenReturn(HotelesFactory.listaHoteles());
        Exception e = Assertions.assertThrows(FechasNoValidasException.class,() -> {
            hotelesService.getElementosDisponiblesPorFechaYDestino(desde, hasta, destino);
        });

        //assert
        Assertions.assertEquals(expectedMessage,e.getMessage());
    }

    @Test
    @DisplayName("Registrar y mostrar los clientes testing")
    void registrarYMostrarTest(){

        //arrange
        PayloadHotelesDto cliente = ClientesFactory.getPayloadHoteles();
        ResponsePayloadHotelesDto reservaEsperada = ClientesFactory.getResponsePayloadHoteles();

        //act
        when(hotelesDaoJson.buscar("CH-0002", "Doble")).thenReturn(HotelesFactory.getHotel());
        ResponsePayloadHotelesDto reservaObtenida = hotelesService.registrarYMostrarCliente(cliente);

        //assert
        verify(hotelesDaoJson, atLeastOnce()).reservar("CH-0002", "Doble");
        Assertions.assertEquals(reservaEsperada,reservaObtenida);
    }

    @Test
    @DisplayName("Registrar y mostrar los clientes testing con un hotel null")
    void registrarYMostrarTestError(){

        //arrange
        PayloadHotelesDto cliente = ClientesFactory.getPayloadHoteles();
        String expectedMessage = "Se debe cargar la información del hotel";
        //act

        when(hotelesDaoJson.buscar(any(),any())).thenReturn(null);
        Exception e = Assertions.assertThrows(HotelesException.class,() ->{

            hotelesService.registrarYMostrarCliente(cliente);
        });

        //assert
        Assertions.assertEquals(expectedMessage,e.getMessage());
    }

    @Test
    @DisplayName("Registrar y mostrar los clientes con un hotel ya reservado error testing")
    void registrarYMostrarTestError2(){

        //arrange
        PayloadHotelesDto cliente = ClientesFactory.getPayloadHoteles();
        Hoteles hotel = HotelesFactory.getHotel3();
        String expectedMessage = "El hotel no está disponible";
        //act

        when(hotelesDaoJson.buscar(any(),any())).thenReturn(hotel);
        Exception e = Assertions.assertThrows(HotelesException.class,() ->{

            hotelesService.registrarYMostrarCliente(cliente);
        });

        //assert
        Assertions.assertEquals(expectedMessage,e.getMessage());
    }

}