package com.example.demo.servicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculadoraTest {

    @Test
    void sumar(){

        //Arrange
        Calculadora calculadora = new Calculadora();
        int numero1 = 10;
        int numero2 = 31;
        int resultadoEsperado = 40;

        //Act
        int resultadoObtenido = calculadora.calcular(numero1, numero2);

        //Assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

}

