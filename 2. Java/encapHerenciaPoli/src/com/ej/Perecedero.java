package com.ej;

public class Perecedero extends Producto {
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
    public double calcular(int cant) {
        if(diasPorCaducar==1){
            return super.calcular(cant)/4;
        }else{
            if(diasPorCaducar==2){
                return super.calcular(cant)/3;
            }else{
                if(diasPorCaducar==3){
                    return super.calcular(cant)/2;
                }
            }
        }
        return super.calcular(cant);
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                "} " + super.toString();
    }
}
