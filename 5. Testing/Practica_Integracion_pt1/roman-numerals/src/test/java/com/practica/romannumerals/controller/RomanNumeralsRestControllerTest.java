package com.practica.romannumerals.controller;

import com.practica.romannumerals.RomanNumeralsRestController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsRestControllerTest {

    RomanNumeralsRestController romanNumeralsRestController;


    @BeforeEach
    void setUp(){
        romanNumeralsRestController=new RomanNumeralsRestController();
    }

    @Test
    @DisplayName("Testea si devuelve el numero 1 en romano")
    void test1() {

        //arrenge
        String expectedResult= "I";
        String actualResult;
        int send= 1;

        //act
        actualResult=romanNumeralsRestController.toRoman(send);

        //assert

        assertEquals(expectedResult,actualResult);

    }

    @Test
    @DisplayName("Testea si devuelve el numero 3 en romano")
    void test2() {

        //arrenge
        String expectedResult= "III";
        String actualResult;
        int send= 3;

        //act
        actualResult=romanNumeralsRestController.toRoman(send);

        //assert

        assertEquals(expectedResult,actualResult);

    }

    @Test
    @DisplayName("Testea si devuelve el numero 5 en romano")
    void test3() {

        //arrenge
        String expectedResult= "V";
        String actualResult;
        int send= 5;

        //act
        actualResult=romanNumeralsRestController.toRoman(send);

        //assert

        assertEquals(expectedResult,actualResult);

    }

    @Test
    @DisplayName("Testea si devuelve el numero 7 en romano")
    void test4() {

        //arrenge
        String expectedResult= "VII";
        String actualResult;
        int send= 7;

        //act
        actualResult=romanNumeralsRestController.toRoman(send);

        //assert

        assertEquals(expectedResult,actualResult);

    }

    @Test
    @DisplayName("Testea si devuelve el numero 10 en romano")
    void test5() {

        //arrenge
        String expectedResult= "X";
        String actualResult;
        int send= 10;

        //act
        actualResult=romanNumeralsRestController.toRoman(send);

        //assert

        assertEquals(expectedResult,actualResult);

    }

    @Test
    @DisplayName("Testea si devuelve el numero 50 en romano")
    void test6() {

        //arrenge
        String expectedResult= "L";
        String actualResult;
        int send= 50;

        //act
        actualResult=romanNumeralsRestController.toRoman(send);

        //assert

        assertEquals(expectedResult,actualResult);

    }
}