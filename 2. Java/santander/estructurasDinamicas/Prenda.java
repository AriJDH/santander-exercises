package com.santander.practicaListas.estructurasDinamicas;

public class Prenda {
    private String marca;
    private String modelo;

    public Prenda(String marca, String modelo) {
        this.setMarca(marca);
        this.setModelo(modelo);
    }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
