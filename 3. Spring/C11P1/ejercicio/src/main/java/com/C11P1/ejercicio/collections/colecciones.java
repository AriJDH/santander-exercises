package com.C11P1.ejercicio.collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class colecciones{

    static TreeMap<Integer, String> mapeo = new TreeMap<Integer, String>();
    static {
        mapeo.put(1000, "M");
        mapeo.put(900, "CM");
        mapeo.put(500, "D");
        mapeo.put(400, "CD");
        mapeo.put(100, "C");
        mapeo.put(90, "XC");
        mapeo.put(50, "L");
        mapeo.put(40, "XL");
        mapeo.put(10, "X");
        mapeo.put(9, "IX");
        mapeo.put(5, "V");
        mapeo.put(4, "IV");
        mapeo.put(1, "I");
    }

    public static String conversorARomano(Integer aConvertir){
        int n = mapeo.floorKey(aConvertir);
        if (aConvertir == n){
            return mapeo.get(aConvertir);
        }
        return mapeo.get(n) + conversorARomano(aConvertir - n);
    }

    @GetMapping(path = "/{numero}")
    public String mostrador(@PathVariable Integer numero){
        return "Su numero romano es: " + conversorARomano(numero);
    }

}
