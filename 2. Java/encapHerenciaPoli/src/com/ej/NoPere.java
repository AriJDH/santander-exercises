package com.ej;

public class NoPere extends Producto{
    private String tipo;

    public NoPere(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NoPere{" +
                "tipo='" + tipo + '\'' +
                "} " + super.toString();
    }
}
