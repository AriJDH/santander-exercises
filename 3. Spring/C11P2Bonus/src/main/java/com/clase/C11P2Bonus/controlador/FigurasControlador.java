package com.clase.C11P2Bonus.controlador;

import com.clase.C11P2Bonus.modelo.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FigurasControlador {

    @GetMapping("/area")
    public String getArea(){
        Punto a = new Punto(0,20);
        Punto b = new Punto(5,20);
        Punto c = new Punto(5,0);
        Punto d = new Punto(0,0);
        Cuadrilatero paralelogramo = new Paralelogramo(a,b,c,d);
        return "" + paralelogramo.calcularArea();
    }

}
