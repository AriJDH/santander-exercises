package com.santander.AgenciaDeTurismo.services;

import com.santander.AgenciaDeTurismo.dtos.request.RequestReservationDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseReservationDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseVueloDTO;
import com.santander.AgenciaDeTurismo.exceptions.VueloDepartOutOfBoundsException;
import com.santander.AgenciaDeTurismo.exceptions.VueloFechaException;
import com.santander.AgenciaDeTurismo.exceptions.VueloNotFoundException;
import com.santander.AgenciaDeTurismo.exceptions.VueloPlaceException;
import com.santander.AgenciaDeTurismo.models.Vuelo;
import com.santander.AgenciaDeTurismo.repo.VueloDAOImpl;
import com.santander.AgenciaDeTurismo.utils.VueloFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.santander.AgenciaDeTurismo.utils.VueloFactory.*;
import static com.santander.AgenciaDeTurismo.utils.VueloFactory.requestVueloDecoyDTO;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class VueloServiceTest {

    @Mock
    VueloDAOImpl vueloDAO;

    @InjectMocks
    VueloService vueloService;

    @Test
    @DisplayName("hacer una reserva válida")
    public void makeReservationTest() {
        Vuelo vueloMock = VueloFactory.vueloValid();
        ResponseReservationDTO responseReservationDTOEsperado = VueloFactory.responseReservationDTOValid();

        when(vueloDAO.buscarElemento(anyString())).thenReturn(vueloMock);

        ResponseReservationDTO responseReservationDTOObtenido = vueloService.makeReservation(VueloFactory.requestVueloDTOValid());

        assertEquals(responseReservationDTOEsperado, responseReservationDTOObtenido);
    }

    @Test
    @DisplayName("hacer una reserva inválida (vuelo not found)")
    public void makeInvalidReservationVueloCodeTest() {

        when(vueloDAO.buscarElemento(anyString())).thenReturn(null);

        assertThrows(VueloNotFoundException.class, () -> vueloService.makeReservation(VueloFactory.requestVueloDTOValid()));
    }

    @Test
    @DisplayName("hacer una reserva inválida (destination)")
    public void makeInvalidReservationDestinationTest() {
        Vuelo vueloMock = VueloFactory.vueloValid();
        RequestReservationDTO requestReservationDTOEnviada = VueloFactory.requestVueloDTOValid();
        requestReservationDTOEnviada.getFlightReservation().setDestination("Buenos Aires");

        when(vueloDAO.buscarElemento(anyString())).thenReturn(vueloMock);

        assertThrows(VueloNotFoundException.class, () -> vueloService.makeReservation(requestReservationDTOEnviada));
    }

    @Test
    @DisplayName("hacer una reserva invalida (fecha de vuelo fuera de rango)")
    public void makeInvalidReservationOutOfBoundsTest() {
        Vuelo vueloMock = VueloFactory.vueloValid();
        RequestReservationDTO requestReservationDTOEnviada = VueloFactory.requestVueloDTOValid();
        requestReservationDTOEnviada.getFlightReservation().setDateFrom(LocalDate.of(2100, 1, 1));

        when(vueloDAO.buscarElemento(anyString())).thenReturn(vueloMock);

        assertThrows(VueloDepartOutOfBoundsException.class, () -> vueloService.makeReservation(requestReservationDTOEnviada));
    }

    @Test
    @DisplayName("Comprobar si dado una fecha de ida/vuelta y un lugar de origen/destino me devuelve los vuelos que cumplen esos criterios.")
    void test1(){

        //MOCK
        when(vueloDAO.existeDestino(anyString()) ).thenReturn(true);
        when(vueloDAO.existeOrigen(anyString()) ).thenReturn(true);
        when(vueloDAO.obtenerElementos()).thenReturn(loadDataBaseVuelos());

        List<ResponseVueloDTO> vueloExpected = new ArrayList<>();

        vueloExpected.add(new ResponseVueloDTO(vueloValid()));

        //Act
        List<ResponseVueloDTO> resultVuelos = vueloService.vuelosFiltrados(requestVueloDecoyDTO());

        //Assert
        assertEquals(vueloExpected, resultVuelos);
    }

    @Test
    @DisplayName("Comprobar si se devuelven todos los vuelos.")
    void test2(){
        List<ResponseVueloDTO> vuelosExpected = loadDataBaseVuelos().stream().map(ResponseVueloDTO::new).collect(Collectors.toList());
        List<Vuelo> vuelosMock = loadDataBaseVuelos();
        List<ResponseVueloDTO> vuelosResult;

        //MOCK
        when(vueloDAO.obtenerElementos()).thenReturn(vuelosMock);
        vuelosResult = vueloService.obtenerElementos();

        assertEquals(vuelosExpected, vuelosResult);
    }

    @Test
    @DisplayName("Filtrar vuelos con fecha inválida.")
    void test3(){
        //Assert
        assertThrows(VueloFechaException.class,()->vueloService.vuelosFiltrados(requestVueloDecoyDTOFechaInvalida()));
    }

    @Test
    @DisplayName("Filtrar vuelos con origen inexistente.")
    void test4(){

        //MOCK
        when(vueloDAO.existeOrigen(anyString()) ).thenReturn(false);

        assertThrows(VueloPlaceException.class,()->vueloService.vuelosFiltrados(requestVueloDecoyDTO()));
    }

    @Test
    @DisplayName("Filtrar vuelos con destinos inexistente.")
    void test5(){

        //MOCK
        when(vueloDAO.existeOrigen(anyString()) ).thenReturn(true);
        when(vueloDAO.existeDestino(anyString()) ).thenReturn(false);

        assertThrows(VueloPlaceException.class,()->vueloService.vuelosFiltrados(requestVueloDecoyDTO()));
    }

}