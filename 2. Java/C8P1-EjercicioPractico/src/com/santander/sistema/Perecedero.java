package com.santander.sistema;

public class Perecedero extends Producto{
    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public int getDiasPorCaducar() {return diasPorCaducar;}
    public void setDiasPorCaducar(int diasPorCaducar) {this.diasPorCaducar = diasPorCaducar;}

    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public double calcular(int cantProducto) {
        double resultado = 0;
        switch (diasPorCaducar){
            case 1:
                resultado = super.calcular(cantProducto) / 4;
                break;
            case 2:
                resultado = super.calcular(cantProducto) / 3;
                break;
            case 3:
                resultado =  super.calcular(cantProducto) / 2;
                break;
            default:
                System.out.println("El producto no tiene fecha de caducidad");
        }
        return resultado;
    }
}
