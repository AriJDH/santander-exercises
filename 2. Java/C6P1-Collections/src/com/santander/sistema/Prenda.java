package com.santander.sistema;

public class Prenda {
    //Atributos de la clase
    private String marca;
    private String modelo;

    //Constructor con el mismo nombre de la clase
    public Prenda(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Métodos de la clase
    public String getModelo() {return modelo;}
    public String getMarca() {return marca;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setMarca(String marca) {this.marca = marca;}

    @Override
    public String toString(){
        return "Prenda : [" + this.getMarca() +","+ this.getModelo()+ "]";
    }
}
