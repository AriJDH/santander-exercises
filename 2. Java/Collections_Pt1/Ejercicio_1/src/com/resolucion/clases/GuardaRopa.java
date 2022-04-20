package com.resolucion.clases;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    int identificador;
    HashMap<Integer, List<Prenda>> diccionario;

    public GuardaRopa(int identificador, HashMap<Integer, List<Prenda> > diccionario) {
        this.identificador = identificador;
        this.diccionario = diccionario;
    }


    public void mostrarPrenda() {
        for (Map.Entry<Integer, List<Prenda>> item : diccionario.entrySet()) {
            System.out.println("ID del guarda ropa: \t" + item.getKey());
            for (Prenda prenda:item.getValue()) {
                System.out.println(prenda.toString());
            }
            System.out.println("---------------------------------------------");
        }
    }

    public Integer guardarPrendas(List<Prenda> listaDePrendas) {
            diccionario.put(identificador,listaDePrendas);
            int identificador_a_devolver=identificador;
            identificador++;
            return identificador_a_devolver;
    }
    public List<Prenda> devolverPrendas(Integer numero){
        /*
        List<Prenda> listaDePrendaADevolver=diccionario.get(numero);
        diccionario.remove(numero);
        return listaDePrendaADevolver;
         */
        return diccionario.remove(numero);
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public HashMap<Integer, List<Prenda>> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(HashMap<Integer, List<Prenda>> diccionario) {
        this.diccionario = diccionario;
    }

    @Override
    public String toString() {
        return "GuardaRopa{" +
                "identificador=" + identificador +
                ", diccionario=" + diccionario +
                '}';
    }
}
