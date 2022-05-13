package com.santanderbootcamp.desafio_spring.unit_test.repo;

import com.santanderbootcamp.desafio_spring.excepciones.HotelesException;
import com.santanderbootcamp.desafio_spring.modelos.Hoteles;
import com.santanderbootcamp.desafio_spring.repo.Dao;
import com.santanderbootcamp.desafio_spring.repo.HotelesDaoJsonImp;
import com.santanderbootcamp.desafio_spring.utils.HotelesFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class HotelesDaoJsonImpTest {


    Dao<String, Hoteles> hotelesDaoJsonImp;

    @BeforeEach
    void setup(){
        hotelesDaoJsonImp = new HotelesDaoJsonImp();
    }

    @Test
    @DisplayName("Se envía solicitud de listado de todos los hoteles registrados.")
    void getListaHoteles(){

        //arr
        List<Hoteles> expected = HotelesFactory.listaHoteles();
        //act
        List<Hoteles> hotelesDevueltos = hotelesDaoJsonImp.getElementos();
        //assert
        Assertions.assertEquals(expected,hotelesDevueltos);

    }

    @Test
    @DisplayName("Se envía una solicitud de listado de todos los hoteles registrados pero con error")
    void getListaHotelesError() {

        //arrange
        hotelesDaoJsonImp.vaciarElementos();
        String expectedMessage = "No existen hoteles";

        //act
        Exception e = Assertions.assertThrows(HotelesException.class,() ->{
            hotelesDaoJsonImp.getElementos();
        });

        //assert
        Assertions.assertEquals(expectedMessage,e.getMessage());
    }

    @Test
    @DisplayName("Se envía una solicitud de listado de todos los hoteles que matcheen con el código de hotel y tipo de habitación")
    void buscarHotelPorCodigoYTipoDeHabitacion(){
        //arr
        List<Hoteles> expected = new ArrayList<>();
        expected.add(HotelesFactory.getHotel());

        //act
        List<Hoteles> hotelesDevueltos = new ArrayList<>();
        hotelesDevueltos.add(hotelesDaoJsonImp.buscar(
                        "CH-0002",
                        "Doble"));

        //assert
        Assertions.assertEquals(expected, hotelesDevueltos);
    }

    @Test
    @DisplayName("Se envía una solicitud de listado de todos los hoteles que matcheen con el código de hotel y tipo de habitación")
    void buscarHotelPorCodigoYTipoDeHabitacionException(){
        //arr
        List<Hoteles> expected = new ArrayList<>();
        expected.add(HotelesFactory.getHotel());
        String expectedMessage = "El hotel no existe";

        //act
        List<Hoteles> hotelesDevueltos = new ArrayList<>();
        Exception e = Assertions.assertThrows(HotelesException.class,() ->{
            hotelesDevueltos.add(hotelesDaoJsonImp.buscar(
                    "CH-00002",
                    "Doble"));
        });

        //assert
        Assertions.assertEquals(expectedMessage, e.getMessage());
    }
// para borrar a futuro
    @Test
    @DisplayName("Se reserva una habitación del hotel")
    void reservarHotel(){
        //arr
        List<Hoteles> hotelLista = new ArrayList<>();
        hotelLista.add(HotelesFactory.getHotel()); // tomen putoooooooos

        hotelesDaoJsonImp.reservar(
                HotelesFactory.getHotel().getCodigoHotel(),
                HotelesFactory.getHotel().getHabitacionTipo()
        );

        List<Hoteles> hotelExpected = hotelesDaoJsonImp.getElementos();

        Assertions.assertEquals("SI", hotelExpected.get(0).getReservado());
    }

    //TODO: hacer que ande.
    @Test
    @DisplayName("Se reserva una habitación del hotel")
    void reservarHotelException(){
        //arr
        String expectedMessage = "EL hotel ya está reservado";

        Exception e = Assertions.assertThrows(HotelesException.class,() ->{
            hotelesDaoJsonImp.reservar(
                    HotelesFactory.getHotel3().getCodigoHotel(),
                    HotelesFactory.getHotel3().getHabitacionTipo()
            );
        });

        Assertions.assertEquals(expectedMessage, e.getMessage());
    }
}