package com.example.demo.servicios;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    void sumar() {

        // Arrange
        Calculadora calculadora = new Calculadora();
        int numero1 = 10;
        int numero2 = 30;
        int resultadoEsperado = 40;

        // Act
        int resultadoObtenido = calculadora.sumar(numero1,numero2);

        // assert
        assertEquals(resultadoEsperado,resultadoObtenido);


    }

}
