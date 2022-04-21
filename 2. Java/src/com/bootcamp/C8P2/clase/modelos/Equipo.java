package com.bootcamp.C8P2.clase.modelos;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private float fondos;
    private String color;
    List<Unidad> unidades;
    public Equipo(float fondos, String color) {
        this.fondos = fondos;
        this.color = color;
        unidades = new ArrayList<>();
    }

    public void comprar(String nombre_unidad) throws UnidadInexistenteException {
        Unidad unidad = null;
        if("soldado".equals(nombre_unidad)){
            unidad = new Soldado();
            fondos = unidad.deducir_costos(this.fondos);
        }else if("tanque".equals(nombre_unidad)){
            unidad = new Tanque();
            fondos = unidad.deducir_costos(this.fondos);
        } else  if ("helicoptero".equals(nombre_unidad)){
            unidad = new Helicoptero();
            fondos = unidad.deducir_costos(this.fondos);
        } else {
            throw new UnidadInexistenteException("Unidad inexistente");
        }
        unidades.add(unidad);
    }

    public void disparar_todos() {
        for (Unidad unidad :
                unidades) {
            unidad.disparar();
        }
    }

    public void mostrar_puntaje() {
        float acum = 0;
        for (Unidad unidad :
                unidades) {
            acum += unidad.getPuntaje();
        }
        System.out.println("Puntaje equipo" + color + " es " + acum);
    }
}
