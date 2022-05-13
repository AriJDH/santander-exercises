package com.practica.calculadorametroscuadrados.service;

import com.practica.calculadorametroscuadrados.TestUtilGenerator;
import com.practica.calculadorametroscuadrados.dto.HouseDTO;
import com.practica.calculadorametroscuadrados.dto.HouseResponseDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.practica.calculadorametroscuadrados.TestUtilGenerator.* ;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculateServiceTest {

    CalculateService calculateService;

    @BeforeEach
    void setUp(){
        calculateService=new CalculateService();
    }

    @Test
    @DisplayName("Verificar el cálculo del valor de la propiedad")
    void calculate() {

        //arrenge
        HouseDTO houseDTOSent= createHouse();
        HouseResponseDTO houseResponseDTOExpected= createHouseResponse();
        HouseResponseDTO houseResponseDTOResult;


        //act

        houseResponseDTOResult=calculateService.calculate(houseDTOSent);

        //assert

        assertEquals(houseResponseDTOExpected.getPrice(),houseResponseDTOResult.getPrice());
    }

    @Test
    @DisplayName("Verificar si reotrna la habitacion mas grande basado en el ancho y largo de la habitacion")
    void biggerRoom() {

        //arrenge
        HouseDTO houseDTOSent= createHouse();
        HouseResponseDTO houseResponseDTOExpected= createHouseResponse();
        HouseResponseDTO houseResponseDTOResult;


        //act

        houseResponseDTOResult=calculateService.calculate(houseDTOSent);

        //assert
        assertAll(
                ()->assertEquals(houseResponseDTOExpected.getBiggest().getLength(),houseResponseDTOResult.getBiggest().getLength()),
                ()->assertEquals(houseResponseDTOExpected.getBiggest().getWidth(),houseResponseDTOResult.getBiggest().getLength())
        );

    }

    @Test
    @DisplayName("Verificar si reotrna la habitacion con el squarefeet correctos")
    void squareFeet() {

        //arrenge
        HouseDTO houseDTOSent= createHouse();
        HouseResponseDTO houseResponseDTOExpected= createHouseResponse();
        HouseResponseDTO houseResponseDTOResult;


        //act

        houseResponseDTOResult=calculateService.calculate(houseDTOSent);

        //assert
        assertAll(
                ()->assertEquals(houseResponseDTOExpected.getBiggest().getSquareFeet(),houseResponseDTOResult.getBiggest().getSquareFeet()),
                ()->assertEquals(houseResponseDTOExpected.getBiggest().getSquareFeet(),houseResponseDTOResult.getBiggest().getSquareFeet())
        );

    }
}