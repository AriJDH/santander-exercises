package com.santander.colecciones;

import com.santander.EjercitacionColecciones;
import com.santander.colecciones.Prenda;

import java.util.HashMap;
import java.util.List;

public class GuardaRopa {
    //Atributos de la clase
    private HashMap<Integer, List<Prenda>> contenido;
    private int contador;

    //Constructor con el mismo nombre de la clase
    public GuardaRopa() {
        this.contador = 0;
        this.contenido = new HashMap<>();
    }

    //Métodos de la clase
    public Integer guardarPrendas(List<Prenda>listaDePrenda)
    {
        contenido.put(contador, listaDePrenda);
        int posicionGuardado = contador;
        contador++;
        return posicionGuardado;
    }

    public void mostrarPrendas()
    {
        contenido.forEach((k,v) -> System.out.println("En la posición " + k + ", están guardadas " + v));
    }

    public List<Prenda>devolverPrendas(Integer numero)
    {
        return contenido.remove(numero);
    }
}
