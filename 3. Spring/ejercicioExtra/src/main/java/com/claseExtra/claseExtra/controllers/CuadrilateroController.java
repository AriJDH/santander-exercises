package com.claseExtra.claseExtra.controllers;

import com.claseExtra.claseExtra.modelo.Cuadrado;
import com.claseExtra.claseExtra.modelo.Cuadrilatero;
import com.claseExtra.claseExtra.modelo.Paralelogramo;
import com.claseExtra.claseExtra.services.Calculador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    /*
    @GetMapping("/trapezoide")
    public int calcularAreaCuadrado(){
        return calculador.calcularArea();
    }
    @GetMapping("/trapezoide")
    public int calcularAreaCuadrado(){
        return calculador.calcularArea()
    }
    @GetMapping("/trapezoide")
    public int calcularAreaCuadrado(){
        return calculador.calcularArea()
    }
    */


}
