package com.santander.AgenciaDeTurismo.controller;

import com.santander.AgenciaDeTurismo.dtos.response.ResponseVueloDTO;
import com.santander.AgenciaDeTurismo.models.Vuelo;
import com.santander.AgenciaDeTurismo.services.VueloService;
import com.santander.AgenciaDeTurismo.dtos.request.RequestBookingDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestReservationDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseBookingDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseReservationDTO;
import com.santander.AgenciaDeTurismo.services.VueloService;
import com.santander.AgenciaDeTurismo.utils.VueloFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.santander.AgenciaDeTurismo.utils.VueloFactory.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class VueloControllerTest {
    @Mock
    VueloService vueloService;

    @InjectMocks
    VueloController vueloController;

    @Test
    @DisplayName("Obtener todos los vuelos.")
    void test1(){
        List<ResponseVueloDTO> vuelosExpected = loadDataBaseVuelos().stream().map(ResponseVueloDTO::new).collect(Collectors.toList());
        List<ResponseVueloDTO> vuelosMock = loadDataBaseVuelos().stream().map(ResponseVueloDTO::new).collect(Collectors.toList());
        ResponseEntity<List<ResponseVueloDTO>> vuelosResult;

        //MOCK
        when(vueloService.obtenerElementos()).thenReturn(vuelosMock);
        vuelosResult = vueloController.getVuelos();

        assertEquals(new ResponseEntity<>(vuelosExpected, HttpStatus.OK), vuelosResult);
    }

    @Test
    @DisplayName("Obtener vuelos filtrados.")
    void test2(){
        List<ResponseVueloDTO> vuelosExpected = new ArrayList<>(List.of(new ResponseVueloDTO(vueloValid())));
        List<ResponseVueloDTO> vuelosMock = new ArrayList<>(List.of(new ResponseVueloDTO(vueloValid())));
        ResponseEntity<List<ResponseVueloDTO>> vuelosResult;

        //MOCK
        when(vueloService.vuelosFiltrados(requestVueloDecoyDTO())).thenReturn(vuelosMock);
        vuelosResult = vueloController.getVuelosFiltrados("10/02/2022","15/02/2022","Buenos Aires","Puerto Iguazú");

        assertEquals(new ResponseEntity<>(vuelosExpected, HttpStatus.OK), vuelosResult);
    }
  @Test
        @DisplayName("reservar vuelo")
        public void makeReservationTest () {
            ResponseEntity<ResponseReservationDTO> responseEntityEsperada = new ResponseEntity<>(VueloFactory.responseReservationDTOValid(), HttpStatus.OK);

            when(vueloService.makeReservation(VueloFactory.requestVueloDTOValid())).thenReturn(VueloFactory.responseReservationDTOValid());

            ResponseEntity<ResponseReservationDTO> responseEntityObtenida = vueloController.makeReservation(VueloFactory.requestVueloDTOValid());

            verify(vueloService, atLeastOnce()).makeReservation(VueloFactory.requestVueloDTOValid());

            assertEquals(responseEntityEsperada, responseEntityObtenida);
        }

}