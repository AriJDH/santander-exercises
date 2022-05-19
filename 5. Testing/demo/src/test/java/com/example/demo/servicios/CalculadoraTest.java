package com.example.demo.servicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @DisplayName(value = "Verificación de suma")
    @Test
    void sumar (){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int numero1 = 10;
        int numero2 = 30;
        int resultadoEsperado = 40;
        //Act
        int resultadoObtenido = calculadora.calcular(numero1,numero2);
        //Assert
        assertEquals(resultadoEsperado,resultadoObtenido);
    }
}
