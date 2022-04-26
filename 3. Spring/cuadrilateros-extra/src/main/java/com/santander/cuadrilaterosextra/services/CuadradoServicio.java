package com.santander.cuadrilaterosextra.services;

import com.santander.cuadrilaterosextra.modelo.Cuadrado;
import com.santander.cuadrilaterosextra.modelo.Punto;

public class CuadradoServicio {

    Punto punto1 = new Punto(0,0);
    Punto punto2 = new Punto(2,0);
    Punto punto3 = new Punto(0,2);
    Punto punto4 = new Punto(2,2);

    Cuadrado cuadrado = new Cuadrado(punto1,punto2,punto3,punto4);

    public String areaDeUnCuadrado(){
        return cuadrado.obtenerArea();
    }

}
