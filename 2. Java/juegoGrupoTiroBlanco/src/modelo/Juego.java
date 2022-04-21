package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        ArrayList<Jugador> jugadores= new ArrayList<>();
        boolean seguirJugando= true;
        while (true) {
            seguirJugando=true;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese nombre de jugador: ");
            String nombre = teclado.next();
            System.out.println("Ingrese modo de jugador: 1. Helicoptero(facil)    2. Tanque(medio)       3. Soldado(dificil)    4. Ver Raking ");
            int opcion = teclado.nextInt();
            Jugador jugador=null;
            switch (opcion) {
                case 1:
                    jugador = new Helicoptero(nombre);
                    break;
                case 2:
                    jugador = new Tanque(nombre);
                    break;
                case 3:
                    jugador = new Soldado(nombre);
                    break;
                case 4:
                    for (Jugador j:
                        jugadores ) {
                        System.out.println(j);

                    }
                    seguirJugando=false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    return;
            }


            while (seguirJugando) {
                boolean lePegaste = false;
                int numeroRandom = (int) Math.floor(Math.random() * 10);
                System.out.print("Ingrese numero a disparar (del 1 al 10) *Si ingresa -1 vuelve al menu* : ");
                int disparo= teclado.nextInt();
                if (disparo==-1){
                    jugadores.add(jugador);
                    break;
                }
                List<Integer> disparos = jugador.disparar(disparo);

                for (Integer d :
                        disparos) {
                    if (d == numeroRandom) {
                        System.out.println("Acertaste en el blanco");
                        jugador.setPuntaje(jugador.getPuntaje() + 1);
                        lePegaste = true;
                        break;
                    }
                }
                if (!lePegaste) {
                    System.out.println("No has acertado en el blanco");
                }
                System.out.println("Su puntaje es de: " + jugador.getPuntaje());
                System.out.println("-------------------------------------------");
            }
        }
    }
}
