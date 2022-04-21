package com.satander.dh;

public class Perecedero extends Producto {

    private Integer diasPorCaducar;

    public Perecedero(String nombre, double precio, Integer diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public Integer getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(Integer diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public double calcular(Integer cantidadDeProductos) {
        Double precioFinal = 0.0;


        switch (diasPorCaducar){
            case 1:
                precioFinal = super.calcular(cantidadDeProductos) / 4;
                break;
            case 2:
                precioFinal = super.calcular(cantidadDeProductos) / 3;
                break;
            case 3:
                precioFinal = super.calcular(cantidadDeProductos) / 2;
                break;
            default:
                precioFinal = super.calcular(cantidadDeProductos);
        }
        return precioFinal;
    }
}
