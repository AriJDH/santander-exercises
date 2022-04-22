package integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.modelo;

import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.services.IComponente;

public class Nave implements IComponente {
    protected String nombre;
    protected double coordenadaX;
    protected double coordenadaY;
    protected int puntos;


    public Nave(String nombre, int[] coordenadas) {
        this.setNombre(nombre);
        this.setCoordenadaX(coordenadas[0]);
        this.setCoordenadaY(coordenadas[1]);
        this.puntos = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }


    public int getPuntos() {
        return puntos;
    }


    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }

    @Override
    public double calcularDistancia() {
        double calculo = (Math.sqrt(Math.pow(Math.pow(coordenadaX, 1) - Math.pow(coordenadaX, 2), 2) +
                Math.pow(Math.pow(coordenadaY, 1) - Math.pow(coordenadaY, 2), 2)));
        this.puntos+=calculo;
        System.out.println("distancia por coordenada: "+calculo);
        return calculo;
    }
}
