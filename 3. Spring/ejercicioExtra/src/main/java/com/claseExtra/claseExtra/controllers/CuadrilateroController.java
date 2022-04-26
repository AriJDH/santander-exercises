package com.claseExtra.claseExtra.controllers;

import com.claseExtra.claseExtra.modelo.*;
import com.claseExtra.claseExtra.services.Calculador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CuadrilateroController {

    Calculador calculador = new Calculador();

    @GetMapping("/cuadrado")
    public int calcularAreaCuadrado(@RequestParam int x,@RequestParam int y){
        Cuadrilatero cuadrado = new Cuadrado(x,y);
        return calculador.calcularArea(cuadrado);
    }

    @GetMapping("/paralelogramo")
    public int calcularAreaParalelogramo(@RequestParam int x,@RequestParam int y,@RequestParam int subY,@RequestParam int subX){
        Cuadrilatero paralelogramo = new Paralelogramo(x,y,subX,subY);
        return calculador.calcularArea(paralelogramo);
    }

    @GetMapping("/rectangulo")
    public int calcularAreaRectangulo(int x, int y, int subX, int subY){
        Cuadrilatero rectangulo = new Rectangulo(x, y, subX, subY);
        return calculador.calcularArea(rectangulo);
    }


    @GetMapping("/trapezoide")
    public int calcularAreaTrapezoide(@RequestParam int x,@RequestParam int y,@RequestParam int xSubUno,@RequestParam  int ySubUno
            , @RequestParam int xSubDos,@RequestParam int ySubDos,@RequestParam int xSubTres,@RequestParam int ySubTres){
        Cuadrilatero trapezoide = new Trapezoide(x, y, xSubUno, ySubUno, xSubDos, ySubDos, xSubTres, ySubTres);
        return calculador.calcularArea(trapezoide);
    }


}
