package com.practica.calculadorametroscuadrados.controller;

import com.practica.calculadorametroscuadrados.dto.HouseDTO;
import com.practica.calculadorametroscuadrados.dto.HouseResponseDTO;
import com.practica.calculadorametroscuadrados.service.CalculateService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.practica.calculadorametroscuadrados.TestUtilGenerator.createHouse;
import static com.practica.calculadorametroscuadrados.TestUtilGenerator.createHouseResponse;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculateRestControllerTest {

    @Mock
    CalculateService calculateService;

    @InjectMocks
    CalculateRestController calculateRestController;


    @Test
    void calculate() {

        //arrenge
        HouseDTO houseDTO = new HouseDTO();
        HouseResponseDTO houseResponseDTOExpected= createHouseResponse();
        HouseResponseDTO houseResponseDTOMock= createHouseResponse();
        HouseResponseDTO houseResponseDTOResult;


        //mock

        when(calculateService.calculate(any())).thenReturn(houseResponseDTOMock);

        //act

        houseResponseDTOResult=calculateRestController.calculate(houseDTO);

        //assert

        assertEquals(houseResponseDTOExpected.getPrice(),houseResponseDTOResult.getPrice());

    }
}