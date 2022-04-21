package com.santander.ejercitacion;

public class Perecedero extends Productos {
    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                '}';
    }

    @Override
    public double calcular(int cantidad) {
        switch (diasPorCaducar) {
            case 1 :
                return super.calcular(cantidad) / 4;
            case 2 :
                return super.calcular(cantidad) / 3;
            case 3 :
                return super.calcular(cantidad) / 2;
            default :
                return super.calcular(cantidad);
        }
    }
}
