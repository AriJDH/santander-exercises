package com.santander.colecciones;

public class Prenda {
    //Atributos de la clase
    private String marca;
    private String modelo;

    //Constructor con el mismo nombre de la clase
    public Prenda(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setModelo(String modelo) { this.modelo = modelo;}

    public String getModelo() { return modelo; }

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }
}
