package com.santander.ejerciciosAbstractasPoli;

public class Personal extends Persona implements Saludar{
    private int legajo;

    public Personal(String dni, String nombre, int legajo) {
        super(dni, nombre);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void pedirAumento(){
        System.out.println("Dame un aumento de sueldo!");
    }
    public void saludar(){
        System.out.println("Hola!");
    }

}
