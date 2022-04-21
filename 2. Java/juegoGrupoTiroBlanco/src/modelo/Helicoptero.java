package modelo;

import java.util.ArrayList;
import java.util.List;

public class Helicoptero extends Jugador{

    public Helicoptero(String nickname) {
        super(nickname);
    }

    @Override
    public List<Integer> disparar(int disparo) {
        List<Integer> disparos= new ArrayList<>();
        disparos.add(disparo-2);
        disparos.add(disparo-1);
        disparos.add(disparo);
        disparos.add(disparo+1);
        disparos.add(disparo+2);
        return disparos;
    }
}
