package modelo;

import java.util.ArrayList;
import java.util.List;

public class Tanque extends Jugador{

    public Tanque(String nickname) {
        super(nickname);
    }

    @Override
    public List<Integer> disparar(int disparo) {
        List<Integer> disparos= new ArrayList<>();
        disparos.add(disparo-1);
        disparos.add(disparo);
        disparos.add(disparo+1);
        return disparos;
    }
}
