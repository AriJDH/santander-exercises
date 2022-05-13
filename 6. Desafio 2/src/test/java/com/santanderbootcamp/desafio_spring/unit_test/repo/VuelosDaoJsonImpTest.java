package com.santanderbootcamp.desafio_spring.unit_test.repo;

import com.santanderbootcamp.desafio_spring.excepciones.VuelosException;
import com.santanderbootcamp.desafio_spring.modelos.Vuelos;
import com.santanderbootcamp.desafio_spring.repo.Dao;
import com.santanderbootcamp.desafio_spring.repo.VuelosDaoJsonImp;
import com.santanderbootcamp.desafio_spring.utils.VuelosFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class VuelosDaoJsonImpTest {


    Dao<String, Vuelos> vuelosDaoJsonImp;

    @BeforeEach
    void setup() {
        vuelosDaoJsonImp = new VuelosDaoJsonImp();

    }

    @Test
    @DisplayName("Se envía solicitud de listado de todos los vuelos registrados.")
    void getListaVuelos() {

        //arr
        List<Vuelos> expected = VuelosFactory.listaVuelos();
        //act
        List<Vuelos> vuelosDevueltos = vuelosDaoJsonImp.getElementos();
        //assert
        Assertions.assertEquals(expected, vuelosDevueltos);

    }

    @Test
    @DisplayName("Se envía una solicitud de listado de todos los vuelos registrados pero con error")
    void getListaVuelosError() {

        //arrange
        vuelosDaoJsonImp.vaciarElementos();
        String expectedMessage = "No existen vuelos";

        //act
        Exception e = Assertions.assertThrows(VuelosException.class, () -> {
            vuelosDaoJsonImp.getElementos();
        });

        //assert
        Assertions.assertEquals(expectedMessage, e.getMessage());
    }



}



