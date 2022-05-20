package com.santander.AgenciaDeTurismo.controller;

import com.santander.AgenciaDeTurismo.dtos.request.RequestBookingDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestHotelFechaDestinoDecoyDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseBookingDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseHotelDTO;
import com.santander.AgenciaDeTurismo.models.Hotel;
import com.santander.AgenciaDeTurismo.services.HotelService;
import com.santander.AgenciaDeTurismo.utils.HotelFactory;
import org.apache.coyote.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static com.santander.AgenciaDeTurismo.utils.HotelFactory.hotelListValid;
import static com.santander.AgenciaDeTurismo.utils.HotelFactory.loadDataBaseHoteles;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class HotelControllerTest {

    @Mock
    HotelService hotelService;

    @InjectMocks
    HotelController hotelController;

    @Test
    @DisplayName("reservar hotel")
    public void bookingTest () {
        ResponseEntity<ResponseBookingDTO> responseEntityEsperada = new ResponseEntity<>(HotelFactory.responseBookingDTOValid(), HttpStatus.OK);
        RequestBookingDTO requestBookingDTOEnviada = HotelFactory.requestBookingDTOValid();

        when(hotelService.makeReservation(requestBookingDTOEnviada)).thenReturn(HotelFactory.responseBookingDTOValid());

        ResponseEntity<ResponseBookingDTO> responseEntityObtenida = hotelController.booking(requestBookingDTOEnviada);

        verify(hotelService, atLeastOnce()).makeReservation(requestBookingDTOEnviada);

        assertEquals(responseEntityEsperada, responseEntityObtenida);
    }

    @Test
    void obtenerHoteles() {
        //arrange
        List<Hotel> hotelesBD= loadDataBaseHoteles();
        List<ResponseHotelDTO> hotelesExpected= new ArrayList<>();
        for (Hotel hotel :
                hotelesBD) {
            hotelesExpected.add(new ResponseHotelDTO(hotel));
        }
        ResponseEntity<List<ResponseHotelDTO>>responseExpected=new ResponseEntity<>(hotelesExpected, HttpStatus.OK);
        ResponseEntity<List<ResponseHotelDTO>>response;
        List<ResponseHotelDTO> hotelesMock= new ArrayList<>();
        for (Hotel hotel :
                hotelesBD) {
            hotelesMock.add(new ResponseHotelDTO(hotel));
        }
        //mock
        when(hotelService.obtenerElementos()).thenReturn(hotelesMock);

        //act
        response=hotelController.obtenerHoteles();

        //assert
        verify(hotelService,atLeastOnce()).obtenerElementos();
        assertEquals(responseExpected,response);



    }

    @Test
    void obtenerHotelesPorFechaDestino() {
        //arrange
        List<ResponseHotelDTO> hotelesExpected= hotelListValid();
        ResponseEntity<List<ResponseHotelDTO>>responseExpected=new ResponseEntity<>(hotelesExpected, HttpStatus.OK);


        ResponseEntity<List<ResponseHotelDTO>>response;

        List<ResponseHotelDTO> hotelesMock= hotelListValid();

        RequestHotelFechaDestinoDecoyDTO hotelDtoSent = new RequestHotelFechaDestinoDecoyDTO("a", "a", "a");
        //Mock

        when(hotelService.obtenerHotelesPorFechaDestino(hotelDtoSent)).thenReturn(hotelesMock);

        //act

        response=hotelController.obtenerHotelesPorFechaDestino("a","a","a");

        //assert

        assertEquals(responseExpected,response);

    }

}