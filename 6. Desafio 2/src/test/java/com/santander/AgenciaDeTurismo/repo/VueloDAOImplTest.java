package com.santander.AgenciaDeTurismo.repo;

import com.santander.AgenciaDeTurismo.models.Vuelo;
import com.santander.AgenciaDeTurismo.utils.HotelFactory;
import com.santander.AgenciaDeTurismo.utils.VueloFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.santander.AgenciaDeTurismo.utils.VueloFactory.*;
import static org.junit.jupiter.api.Assertions.*;

class VueloDAOImplTest {
    VueloDAOImpl vueloDAO;

    @BeforeEach
    public void setup () {
        vueloDAO = new VueloDAOImpl();
    }

    @Test
    @DisplayName("buscar vuelo por número válido")
    public void buscarElementoTest () {
        Vuelo vueloEsperado = VueloFactory.vueloValid();

        Vuelo vueloObtenido = vueloDAO.buscarElemento(vueloEsperado.getFlightNumber());

        assertEquals(vueloEsperado, vueloObtenido);
    }

    @Test
    @DisplayName("buscar vuelo por número inválido")
    public void buscarElementoNotFoundTest () {
        Vuelo vueloRecibido = vueloDAO.buscarElemento("_");

        assertEquals(null, vueloRecibido);
    }

    @Test
    @DisplayName("verifico si devuelve todos los vuelos registrados o no hay vuelos registrados.")
    void buscarVuelos() {
        //Arrange
        List<Vuelo> vuelosResult;
        List<Vuelo> vuelosExpected = loadDataBaseVuelos();

        //Act
        vuelosResult = vueloDAO.obtenerElementos();

        //Assert
        Assertions.assertEquals(vuelosExpected, vuelosResult);
    }

    @Test
    @DisplayName("verifico si hay registros de vuelos que cumplan el criterio o no.")
    void vuelosValidos () {
        //Arrange
        Object vueloResult;
        Vuelo vueloExpected = vueloValid();
        String clave = vueloExpected.getFlightNumber();

        //Act
        vueloResult = vueloDAO.buscarElemento(clave);

        //Assert
        Assertions.assertEquals(vueloExpected,vueloResult);
    }

    @Test
    @DisplayName("verifico si el lugar de origen existe.")
    void origenValido () {
        //Arrange
        String destinoExpected = vueloValid().getOrigin();

        //Act
        boolean result = vueloDAO.existeOrigen(destinoExpected);

        //Assert
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("verifico si el lugar de origen NO existe.")
    void origenInvalido () {
        //Arrange
        String destinoExpected = vueloInvalid().getOrigin();

        //Act
        boolean result = vueloDAO.existeOrigen(destinoExpected);

        //Assert
        Assertions.assertFalse(result);
    }
    @Test
    @DisplayName("verifico si el destino existe.")
    void destinoValido () {
        //Arrange
        String destinoExpected = vueloValid().getDestination();

        //Act
        boolean result = vueloDAO.existeDestino(destinoExpected);

        //Assert
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("verifico si el destino NO existe.")
    void destinoInvalido () {
        //Arrange
        String destinoExpected = vueloInvalid().getDestination();

        //Act
        boolean result = vueloDAO.existeDestino(destinoExpected);

        //Assert
        Assertions.assertFalse(result);
    }
}