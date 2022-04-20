package com.santander.sistema;

import java.util.HashMap;
import java.util.List;

public class GuardaRopa {
    //Atributos de la clase
    private HashMap< Integer,List<Prenda> > diccionario;
    private int contador;

    //Constructor con el mismo nombre de la clase
    public GuardaRopa(HashMap<Integer, List<Prenda>> diccionario, int contador) {
        this.diccionario = diccionario;
        this.contador = contador;
    }

    //getters
    public HashMap<Integer, List<Prenda>> getDiccionario() {return diccionario;}
    public int getContador() {return contador;}

    //setters
    public void setDiccionario(HashMap<Integer, List<Prenda>> diccionario) {this.diccionario = diccionario;}
    public void setContador(int contador) {this.contador = contador;}

    public Integer guardarPrendas(List<Prenda> listaPrenda) {
        ++contador;
        diccionario.put(contador,listaPrenda);
        return contador;
    }

    public String mostrar_prendas() {
        return "Prendas : " + this.getDiccionario() +", Número : "+ this.getContador();
    }

    public List<Prenda> devolver_Prendas(Integer clave) {
        return diccionario.get(clave);
    }

}
