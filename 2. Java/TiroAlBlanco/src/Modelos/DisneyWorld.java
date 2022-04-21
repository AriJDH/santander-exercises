package Modelos;

import java.util.ArrayList;
import java.util.List;

public class DisneyWorld {

    List<Jugador> jugadores = new ArrayList<>();

    public void iniciarGuerra(int Rounds){
        for (int i = 0;i<=Rounds;i++){
            for (Jugador jugador : jugadores){
                jugador.Disparar();
            }
        }
    }

}
