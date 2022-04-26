package com.C11P2.ejercicioExtra.controller;

import com.C11P2.ejercicioExtra.clases.*;
import com.C11P2.ejercicioExtra.service.Calculador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CuadrilateroController {
    Calculador calculador = new Calculador();


    @GetMapping(path = "/cuadrado/")
    public int calcularAreaCuadrado(@RequestParam int x, @RequestParam int y){
        return calculador.calcularAreaCuadrado(x, y);
    }

    @GetMapping(path = "/rectangulo/")
    public int calcularAreaRectangulo(@RequestParam int x, @RequestParam int y, @RequestParam int subX, @RequestParam int subY){
        return calculador.calcularAreaRectangulo(x, y, subX, subY);
    }

    @GetMapping(path = "/paralelogramo/")
    public int calcularAreaParalelogramo(@RequestParam int x, @RequestParam int y, @RequestParam int subX, @RequestParam int subY){
        return calculador.calcularAreaParalelogramo(x, y, subX, subY);
    }

    @GetMapping(path = "/trapezoide/")
    public int calcularAreaTrapezoide(@RequestParam int x, @RequestParam int y, @RequestParam int xSubUno, @RequestParam int ySubUno, @RequestParam int xSubDos, @RequestParam int ySubDos, @RequestParam int xSubTres, @RequestParam int ySubTres){
        return calculador.calcularAreaTrapezoide(x, y, xSubUno, ySubUno, xSubDos, ySubDos, xSubTres, ySubTres);
    }
}
