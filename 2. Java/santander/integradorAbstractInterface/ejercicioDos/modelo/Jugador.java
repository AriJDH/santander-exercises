package integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.modelo;

import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.services.IComponente;

public class Jugador {
    private String nombre;
    private IComponente eleccion;
    private int puntaje;

    public Jugador(String nombre,IComponente eleccion) {
        this.nombre = nombre;
        this.eleccion = eleccion;
        this.puntaje = 0;
    }

    public void aumentarPuntaje(){
        this.puntaje++;
    }

    public double jugar(){
        return eleccion.calcularDistancia();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
