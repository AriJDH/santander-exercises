package integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos;

import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.modelo.FlotaNave;
import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.modelo.Juego;
import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.modelo.Jugador;
import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.modelo.Nave;
import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.services.IComponente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] coordenadas = {1,4};
        int[] coordenadasDos = {4,4};
        int[] coordenadasTres = {2,4};

        Nave naveSimple = new Nave("Atlantis",coordenadas);
        Nave naveSimpleDos = new Nave("Atlantis",coordenadasDos);
        Nave naveSimpleTres = new Nave("Atlantis",coordenadasTres);

        FlotaNave naveCompuesta = new FlotaNave();
        naveCompuesta.agregarNave(naveSimpleDos);
        naveCompuesta.agregarNave(naveSimpleTres);

        Juego juego = new Juego();
        juego.agregarJugador(new Jugador("Brian",naveCompuesta));
        juego.agregarJugador(new Jugador("pepe",naveSimple));

        juego.jugar();
        Jugador jugadorGanador = juego.obtenerGanador();
        System.out.println("la distancia recorrida por la nave compuesta es de:"+naveCompuesta.calcularDistancia());
        System.out.println("la distancia recorrida por la nave simple es de:"+ naveSimple.calcularDistancia());
        System.out.println("el ganador es: "+jugadorGanador.getNombre()+ " con un puntaje de: "+ jugadorGanador.getPuntaje());



    }
}
