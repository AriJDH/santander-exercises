package com.ej2;

import java.util.ArrayList;

public class Flota extends NaveAbs {
    private ArrayList<NaveAbs> elementos;
    public Flota(String nombre) {
        super(nombre);
        elementos= new ArrayList<>();
    }
    public void addElemento (NaveAbs ele){
        elementos.add(ele);
    }
    @Override
    public double distancia(double[] coordenadasDeAsteroide) {
        double acum=0;
        for (NaveAbs e: elementos) {
            acum=acum+e.distancia(coordenadasDeAsteroide);
        }
        if (elementos.size()==0){
            return -1;
        }else{
            return acum/elementos.size();
        }
    }
}
