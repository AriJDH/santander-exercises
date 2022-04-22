package com.santander.ejerciciosAbstractasPoli2;

import java.util.ArrayList;
import java.util.List;

public class FlotaDeNaves {
    String nombre;
    List<Nave> flota;

    public FlotaDeNaves(String nombre) {
        this.nombre = nombre;
        flota=new ArrayList<>();
    }
    public void cargarNave(Nave unaNave){
        flota.add(unaNave);
    }

}
