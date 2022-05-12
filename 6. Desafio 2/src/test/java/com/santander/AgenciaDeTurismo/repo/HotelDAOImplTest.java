package com.santander.AgenciaDeTurismo.repo;

import com.santander.AgenciaDeTurismo.models.Hotel;
import com.santander.AgenciaDeTurismo.utils.HotelFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.Collator;
import java.util.List;

import static com.santander.AgenciaDeTurismo.utils.HotelFactory.loadDataBaseHoteles;
import static org.junit.jupiter.api.Assertions.*;

class HotelDAOImplTest {

    HotelDAOImpl hotelDAO;

    @BeforeEach
    public void setup () {
        hotelDAO = new HotelDAOImpl();
    }

    @Test
    @DisplayName("buscar hotel por codigo válido")
    public void buscarElementoTest () {
        Hotel hotelEsperado = HotelFactory.hotelValid();

        Hotel hotelRecibido = hotelDAO.buscarElemento(hotelEsperado.getHotelCode());

        assertEquals(hotelEsperado, hotelRecibido);
    }

    @Test
    @DisplayName("buscar hotel por codigo inválido")
    public void buscarElementoNotFoundTest () {
        Hotel hotelRecibido = hotelDAO.buscarElemento("_");

        assertEquals(null, hotelRecibido);
    }

    @Test
    @DisplayName("confirmar reserva de hotel")
    public void confirmarReservaTest () {
        Hotel hotelEnviado = HotelFactory.hotelValid();
        hotelEnviado.setReserved(false);

        hotelDAO.confirmarReserva(hotelEnviado);

        assertTrue(hotelEnviado.isReserved());
    }
    @Test
    @DisplayName("Verifica que llegue todos los hoteles del json")
    void buscarHoteles() {

        //arrange
        List<Hotel> hotelesExpected;
        hotelesExpected= loadDataBaseHoteles();
        List<Hotel> hotelResult;
        //act
        hotelResult=hotelDAO.obtenerElementos();

        //assert
        //TODO: Preguntar
        assertAll(
                ()->assertNotNull(hotelResult),
                ()->assertEquals(hotelesExpected,hotelResult));
    }

    @Test
    @DisplayName("Verifica que el nombre del destino se encuentre en el json")
    void destinationExists(){

        //arrange
        String destination="Puerto Iguazú";
        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.PRIMARY);

        //act & assert
        assertTrue(hotelDAO.destinationExists(destination,collator));
    }

    @Test
    @DisplayName("Verifica como reacciona cuando el nombre del destino se encuentre en el json")
    void destinationDoesNotExists(){

        //arrange
        String destination="Puerto Pepito";
        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.PRIMARY);

        //act & assert
        assertFalse(hotelDAO.destinationExists(destination,collator));
    }

}