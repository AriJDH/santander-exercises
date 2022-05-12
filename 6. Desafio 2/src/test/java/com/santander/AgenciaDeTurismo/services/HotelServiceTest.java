package com.santander.AgenciaDeTurismo.services;

import com.santander.AgenciaDeTurismo.dtos.request.RequestBookingDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestHotelFechaDestinoDecoyDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseBookingDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseHotelDTO;
import com.santander.AgenciaDeTurismo.exceptions.*;
import com.santander.AgenciaDeTurismo.models.Hotel;
import com.santander.AgenciaDeTurismo.repo.HotelDAOImpl;
import com.santander.AgenciaDeTurismo.utils.HotelFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.santander.AgenciaDeTurismo.utils.HotelFactory.hotelListValid;
import static com.santander.AgenciaDeTurismo.utils.HotelFactory.loadDataBaseHoteles;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class HotelServiceTest {

    @Mock
    HotelDAOImpl hotelDAO;

    @InjectMocks
    HotelService hotelService;

    @Test
    @DisplayName("hacer una reserva válida")
    public void makeReservationTest() {
        Hotel hotelMock = HotelFactory.hotelValid();
        ResponseBookingDTO responseBookingDTOEsperado = HotelFactory.responseBookingDTOValid();

        when(hotelDAO.buscarElemento(anyString())).thenReturn(hotelMock);

        ResponseBookingDTO responseBookingDTOObtenido = hotelService.makeReservation(HotelFactory.requestBookingDTOValid());

        assertEquals(responseBookingDTOEsperado, responseBookingDTOObtenido);
    }

    @Test
    @DisplayName("hacer una reserva inválida (hotel not found)")
    public void makeInvalidReservationHotelCodeTest() {
        Hotel hotelMock = HotelFactory.hotelValid();

        // el codigo de hotel puede existir pero necesitamos que el dao nos retorne null para probar cuando el codigo no es válido
        when(hotelDAO.buscarElemento(anyString())).thenReturn(null);

        assertThrows(HotelNotFoundException.class, () -> hotelService.makeReservation(HotelFactory.requestBookingDTOValid()));
    }

    @Test
    @DisplayName("hacer una reserva inválida (destination)")
    public void makeInvalidReservationDestinationTest() {
        Hotel hotelMock = HotelFactory.hotelValid();
        RequestBookingDTO requestBookingDTOEnviada = HotelFactory.requestBookingDTOValid();
        requestBookingDTOEnviada.getBooking().setDestination("Buenos Aires");

        when(hotelDAO.buscarElemento(anyString())).thenReturn(hotelMock);

        assertThrows(HotelNotFoundException.class, () -> hotelService.makeReservation(requestBookingDTOEnviada));
    }

    @Test
    @DisplayName("hacer una reserva invalida (dateFrom > dateTo)")
    public void makeInvalidReservationFechaExceptinoTest() {
        Hotel hotelMock = HotelFactory.hotelValid();
        RequestBookingDTO requestBookingDTOEnviada = HotelFactory.requestBookingDTOValid();
        requestBookingDTOEnviada.getBooking().setDateTo(LocalDate.of(2000, 1, 1));

        when(hotelDAO.buscarElemento(anyString())).thenReturn(hotelMock);

        assertThrows(HotelFechaException.class, () -> hotelService.makeReservation(requestBookingDTOEnviada));
    }

    @Test
    @DisplayName("hacer una reserva invalida (hotel reservado)")
    public void makeInvalidReservationHotelReservadoTest() {
        Hotel hotelMock = HotelFactory.hotelValid();
        hotelMock.setReserved(true);
        RequestBookingDTO requestBookingDTOEnviada = HotelFactory.requestBookingDTOValid();

        when(hotelDAO.buscarElemento(anyString())).thenReturn(hotelMock);

        assertThrows(HotelAlreadyReservedException.class, () -> hotelService.makeReservation(requestBookingDTOEnviada));
    }

    @Test
    @DisplayName("hacer una reserva invalida (hotel fuera de rango)")
    public void makeInvalidReservationOutOfBoundsTest() {
        Hotel hotelMock = HotelFactory.hotelValid();
        RequestBookingDTO requestBookingDTOEnviada = HotelFactory.requestBookingDTOValid();
        requestBookingDTOEnviada.getBooking().setDateTo(LocalDate.of(2100, 1, 1));

        when(hotelDAO.buscarElemento(anyString())).thenReturn(hotelMock);

        assertThrows(HotelPeriodOutOfBoundsException.class, () -> hotelService.makeReservation(requestBookingDTOEnviada));
    }

    @Test
    @DisplayName("Verifica que llegue todos los hoteles del json")
    void obtenerElementos() {

        //Arrange
        List<Hotel> hotelesBD= loadDataBaseHoteles();
        List<ResponseHotelDTO> hotelesExpected= new ArrayList<>();
        for (Hotel hotel :
                hotelesBD) {
            hotelesExpected.add(new ResponseHotelDTO(hotel));
        }
        List<Hotel>hotelesListMock= loadDataBaseHoteles();
        List<ResponseHotelDTO>hotelesResultado;
        //Mock
        when(hotelDAO.obtenerElementos()).thenReturn(hotelesListMock);

        //act
        hotelesResultado=hotelService.obtenerElementos();

        //assert

        assertEquals(hotelesExpected,hotelesResultado);

    }

    @Test
    @DisplayName("Verifica como reacciona cuando no encuentra ningun hoteles del json")
    void obtenerElementosListNull() {

        //Mock
        when(hotelDAO.obtenerElementos()).thenReturn(null);


        //act & assert

        assertThrows(HotelNotFoundException.class, ()-> hotelService.obtenerElementos());
        verify(hotelDAO,times(1)).obtenerElementos();
    }

    @Test
    @DisplayName("Verifica que llegue todos los hoteles del json entre el rango de fecha y el destino enviado")
    void obtenerHotelesPorFechaDestino() {

        //arrange
        RequestHotelFechaDestinoDecoyDTO requestHotelSent= new RequestHotelFechaDestinoDecoyDTO("Puerto Iguazú","12/02/2022","19/03/2022");
        List<ResponseHotelDTO> responseHotelExpected= hotelListValid();
        List<ResponseHotelDTO> result;
        //Mock

        when(hotelDAO.destinationExists(any(),any())).thenReturn(true);
        when(hotelDAO.obtenerElementos()).thenReturn(loadDataBaseHoteles());

        //act
        result=hotelService.obtenerHotelesPorFechaDestino(requestHotelSent);

        //assert

        assertEquals(responseHotelExpected,result);


    }
    @Test
    @DisplayName("Verifica como reacciona cuando no encuentra hoteles en el json entre el rango de fecha y el destino enviado")
    void obtenerHotelesPorFechaDestinoNotFound() {

        //arrange
        RequestHotelFechaDestinoDecoyDTO requestHotelSent= new RequestHotelFechaDestinoDecoyDTO("Puerto Iguazú","09/02/2022","19/03/2022");
        List<ResponseHotelDTO> responseHotelExpected= hotelListValid();
        List<ResponseHotelDTO> result;
        //Mock

        when(hotelDAO.destinationExists(any(),any())).thenReturn(true);
        when(hotelDAO.obtenerElementos()).thenReturn(loadDataBaseHoteles());

        //act & assert

        assertThrowsExactly(HotelNotFoundException.class, ()->hotelService.obtenerHotelesPorFechaDestino(requestHotelSent));


    }
    @Test
    @DisplayName("Verifica como reacciona cuando las fechas from > a la fecha to")
    void obtenerHotelesPorFechaDestinoInvalidDate() {

        //arrange
        RequestHotelFechaDestinoDecoyDTO requestHotelSent= new RequestHotelFechaDestinoDecoyDTO("Puerto Iguazú","12/04/2022","19/03/2022");
        List<ResponseHotelDTO> responseHotelExpected= hotelListValid();
        List<ResponseHotelDTO> result;
        //Mock

        when(hotelDAO.destinationExists(any(),any())).thenReturn(true);
        when(hotelDAO.obtenerElementos()).thenReturn(loadDataBaseHoteles());

        //act & assert

        assertThrowsExactly(HotelFechaException.class, ()->hotelService.obtenerHotelesPorFechaDestino(requestHotelSent));


    }

    @Test
    @DisplayName("Verifica como reacciona cuando el nombre del destino no se encuentra en el json")
    void obtenerHotelesPorFechaDestinoInvalidDestination() {

        //arrange
        RequestHotelFechaDestinoDecoyDTO requestHotelSent= new RequestHotelFechaDestinoDecoyDTO("Puerto","12/04/2022","19/03/2022");
        List<ResponseHotelDTO> responseHotelExpected= hotelListValid();
        List<ResponseHotelDTO> result;
        //Mock

        when(hotelDAO.destinationExists(any(),any())).thenReturn(false);



        //act & assert

        assertThrowsExactly(HotelDestinationNotFoundException.class, ()->hotelService.obtenerHotelesPorFechaDestino(requestHotelSent));


    }

}