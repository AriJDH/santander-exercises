package com.clase.C11P2Bonus.controlador;

import com.clase.C11P2Bonus.modelo.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FigurasControlador {

    @GetMapping("/paralelogramo")
    public String getAreaP(){
        Punto a = new Punto(5,10);
        Punto b = new Punto(10,10);
        Punto c = new Punto(15,0);
        Punto d = new Punto(0,0);
        Paralelogramo paralelogramo = new Paralelogramo(a,b,c,d);
        return "" + paralelogramo.calcularArea();
    }

    @GetMapping("/rectangulo")
    public String getAreaR(){
        Punto a = new Punto(0,20);
        Punto b = new Punto(5,20);
        Punto c = new Punto(5,0);
        Punto d = new Punto(0,0);
        Rectangulo rectangulo = new Rectangulo(a,b,c,d);
        return "" + rectangulo.calcularArea();
    }

    @GetMapping("/cuadrado")
    public String getAreaC(){
        Punto a = new Punto(0,10);
        Punto b = new Punto(10,10);
        Punto c = new Punto(10,0);
        Punto d = new Punto(0,0);
        Cuadrado cuadrado = new Cuadrado(a,b,c,d);
        return "" + cuadrado.calcularArea();
    }

}
